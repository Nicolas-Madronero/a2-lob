package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.stockexchange.tradingagent.TradingAgent;
import ca.yorku.cmg.lob.trader.Trader;
import main.java.ca.yorku.cmg.lob.stockexchange.tradingagent.TradingAgentRetail;

public class TradingAgentFactory extends AbstractTradingAgentFactory {
    TradingAgent agent;
    @Override
    public TradingAgent createAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        // Define agent type
        if(type.equals("Institutional")){
            agent = new TradingAgentInstitutional(t, e, n); 
        }else if(type.equals("Retail")){
            agent = new TradingAgentRetail(t, e, n);
        }else{
            throw new IllegalArgumentException("Invalid type: " + type);
        }

        //Implement trading style
        if(style.equals("Aggressive")){
            agent.setTradingStrategy(new Agressive());
        }else if (style.equals("Conservative")){
            agent.setTradingStrategy(new Conservative());
        }else{
            throw new IllegalArgumentException("Invalid style: " + style);
        }
        return agent;
    }

}
