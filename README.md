# Stock API

## Overview
The Stock API is a RESTful web service that provides financial data such as stock prices, analyst recommendations, and more for various companies based on their ticker symbols. The API sources its data from Yahoo Finance.

## Features
- Retrieve real-time and historical stock prices.
- Get analyst recommendations for a given stock.
- Access detailed financial statistics for companies.
- View institutional holdings of major stocks.
- Fetch options data for different tickers.
- More endpoints to explore dividends, earnings, and other key financial data.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
    - [Stock Price](#stock-price)
    - [Stock History](#stock-history)
    - [Stock News](#stock-news)
    - [Stock Profile](#stock-profile)
    - [Analyst Recommendations](#analyst-recommendations)
    - [Trending Stocks](#trending-stocks)
    - [Stock Dividends](#stock-dividends)
    - [Stock Earnings](#stock-earnings)
    - [Stock Financials](#stock-financials)
    - [Top Gainers](#top-gainers)
    - [Top Losers](#top-losers)
    - [Sectors](#sectors)
- [Code Samples](#code-samples)
- [License](#license)

# Technologies Used
- **Java** 
- **Spring Boot** for REST API
- **Yahoo Finance** for financial data
- **AWS EC2** with **Tomcat** for deployment
- **Maven** for build and dependency management

# Usage
The API can be interacted with using any HTTP client like curl or Postman. Below are the available endpoints:

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/30801955-7cd82c2f-45ce-484c-959e-38011fe23927?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D30801955-7cd82c2f-45ce-484c-959e-38011fe23927%26entityType%3Dcollection%26workspaceId%3D1bc07b6b-ae8c-4284-b1a5-8639826e63c1)
# API Endpoints
## Stock Price
Retrieves the current price data for a given stock ticker. It provides essential information such as the stock’s current price, daily high and low, yearly high and low, and the trading volume.
```
GET /stock/v1/{TICKER}/price HTTP/1.1
Host: api.maddaxlallatin.com
```

## Stock History
Retrieves the historical stock data for a given ticker symbol. The data includes key financial metrics for each day, such as the stock's opening price, closing price, daily high and low prices, adjusted closing price, and the volume of shares traded.
```
GET /stock/v1/{TICKER}/history HTTP/1.1
Host: api.maddaxlallatin.com
```
### Query Params
`start_date`
**YYYY-MM-DD**
_optional_

`end_date`
**YYYY-MM-DD**
_optional_
```
GET /stock/v1/{TICKER}/history?start_date=YYYY-MM-DD&end_date=YYYY-MM-DD HTTP/1.1
Host: api.maddaxlallatin.com
```

## Stock News
Retrieves the latest news articles related to a specified stock ticker. The response includes a list of articles, each containing a title, a brief description, and a link to the full article on Yahoo Finance.
```
GET /stock/v1/{TICKER}/news HTTP/1.1
Host: api.maddaxlallatin.com
```
### Query Params
`number`
**10**
**_optional_**
_default: 10, min: 1, max: 20_
```
GET /stock/v1/{TICKER}/news?number=10 HTTP/1.1
Host: api.maddaxlallatin.com
```
## Stock Profile
Retrieves key data such as the company's name, sector, industry, CEO, and number of employees. 
```
GET /stock/v1/{TICKER}/profile HTTP/1.1
Host: api.maddaxlallatin.com
```

## Analyst Recommendations
Retrieves analyst recommendations for a specified stock ticker. Each recommendation includes the analyst's name, overall score, direction score, price score, rating (such as "Buy" or "Outperform"), target price, and the date of the recommendation.
```
GET /stock/v1/{TICKER}/analyst-recommendations HTTP/1.1
Host: api.maddaxlallatin.com
```
## Trending Stocks
Retrieves real-time data on stocks currently experiencing significant market activity. The response includes a list of trending stocks, each containing the ticker symbol, company name, current price, price change, percentage change, trading volume, average volume, market capitalization, price-to-earnings ratio, year-to-date percentage change, and a link to the day's chart on Yahoo Finance.

```
GET /stock/v1/trending HTTP/1.1
Host: api.maddaxlallatin.com
```

## Stock Dividends
Retrieves historical dividend payments for a specified stock ticker. The response includes the stock ticker and a list of dividend records, each containing the payment date and the dividend amount.

```
GET /stock/v1/AAPL/dividends HTTP/1.1
Host: api.maddaxlallatin.com
```
### Query Params
`number_dividends`
**15**
**_optional_**
_default: 15_

```
GET /stock/v1/AAPL/dividends?number_dividends=15 HTTP/1.1
Host: api.maddaxlallatin.com
```
## Stock Earnings
Retrieves the earnings data for a specified stock ticker, including key metrics related to earnings performance. The response includes the stock ticker and a list of earnings records containing the earnings date, earnings per share (EPS) estimate, reported EPS, and surprise percentage.
```
GET /stock/v1/AAPL/earnings HTTP/1.1
Host: api.maddaxlallatin.com
```
## Stock Financials
Retrieves the financial data for a specified stock ticker, including key metrics for the fiscal year. The response includes the stock ticker and a list of financial records containing total revenue, cost of revenue, gross profit, operating expenses, net income, earnings per share (EPS), and cash flow metrics.
```
GET /stock/v1/AAPL/financials HTTP/1.1
Host: api.maddaxlallatin.com
```
### Query Params

`income_statement`
**true**
_optional_
_default: true_

`balance_sheet`
**true**
_optional_
_default: true_

`cash_flow`
**true**
_optional_
_default: true_
```
GET /stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true HTTP/1.1
Host: api.maddaxlallatin.com
```

## Top Gainers
Retrieves a list of the top stock gainers for the day, including details about each company's stock performance.
```
GET /stock/v1/gainers HTTP/1.1
Host: api.maddaxlallatin.com
```

## Top Losers
Retrieves a list of the top stock losers for the day, including details about each company's stock performance.
```
GET /stock/v1/losers HTTP/1.1
Host: api.maddaxlallatin.com
```

## Sectors
Retrieves detailed information about market sectors, including their respective market weights and year-to-date returns. The response contains a list of sectors, each detailing the sector name, market weight percentage, and YTD return percentage. 

```
GET /stock/v1/sectors HTTP/1.1
Host: api.maddaxlallatin.com
```
# Code Samples

#### Node.js - Axios
```js
const axios = require('axios');

let config = {
  method: 'get',
  maxBodyLength: Infinity,
  url: 'https://api.maddaxlallatin.com/stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true',
  headers: { }
};

axios.request(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
});

```

#### C\# - HttpClient
```csharp
var client = new HttpClient();
var request = new HttpRequestMessage(HttpMethod.Get, "https://api.maddaxlallatin.com/stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true");
var response = await client.SendAsync(request);
response.EnsureSuccessStatusCode();
Console.WriteLine(await response.Content.ReadAsStringAsync());

```

#### Python - Requests
```python
import requests

url = "https://api.maddaxlallatin.com/stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true"

payload = {}
headers = {}

response = requests.request("GET", url, headers=headers, data=payload)

print(response.text)

```

#### Java - OkHttp
```java
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
  .url("https://api.maddaxlallatin.com/stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true")
  .method("GET", body)
  .build();
Response response = client.newCall(request).execute();
```

#### Shell - wget
```shell
wget --no-check-certificate --quiet \
  --method GET \
  --timeout=0 \
  --header '' \
   'https://api.maddaxlallatin.com/stock/v1/AAPL/financials?income_statement=true&balance_sheet=true&cash_flow=true'
```

## License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/maddaxlallatin/stockAPI/blob/master/LICENSE) file for details.

