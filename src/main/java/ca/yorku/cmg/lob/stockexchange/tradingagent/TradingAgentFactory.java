package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.stockexchange.tradingagent.TradingAgent;
import ca.yorku.cmg.lob.trader.Trader;
import main.java.ca.yorku.cmg.lob.stockexchange.tradingagent.TradingAgentRetail;

public class TradingAgentFactory extends AbstractTradingFactory {

    @Override
    public abstract TradingAgent createAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        
    }

}
