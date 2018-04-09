// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// SaleRefundRequest.java
// @version 0.1.0-dev+843c6b-dirty
// @type request
// @data H4sIAAAAAAAC/+xbX2/jNhJ/v08x0N7DZiFb2aa7bf0WdFus79oml6QFDrnAGUsjiw1FqiQVR1jsdz9QFGXLcv5dXSO30JOh4ZDmzG84HP4ofQp+wZyCSaCR01hRWookCIMPpGPFCsOkCCbBWS3WgGC1QphXMP0whh+lAoS05BxcxxASCUIaYCLmZUJgMoJrzGUpzDXI+e8U27Za/I/zk19A0R8laQNzmVR+vAKVYbga0o+F4ulDBWHwr5JUdYoKczKkdDC5vAqDj4QJqY70U3BRFbUDjGJiEYTBb6gYzjk1jimwKpCPmvFHzLrnn1Q1radYnSIfnTWt077zLjICTeqWFGgjFWm4oUpDKhUcHUKClbbTPVYKKzeTwzA4I0xOBK+CSYpckxX8UTJFSSs4VbIgZRjpYCJKzj9fhcGPUuWbFp+iyZ5nr4V4tmHlVqOmH0CmNQC2CxiFQmNsFcDIBr5nmWZUeY9ljXvdIK0F7i9mDTJ9S3rtK4N6TV3zjpvp+6j6switvO4iuD/XVr6aYyvqu77AKidhwKmEsGQmg4QMMq53N9f7IiQulSIRV53Zrgn78700mSIaxRkqjA0pmJ6fjL7+6u034LtBLBO6eh0lMtYRE4YWCu0AUcIUxSZSpE3klUdWWUcHY3DLDxJJuk48uiwKqQwg535oRnoXURhuQDhr3N13z6ph5Z2VrO8cTBJmH60dTg1wLktTL60u0n89tguWmtlSYdGZ/rq0b4BtBdsKKdEYfsY7lpc5cBILkwHT8PYQWuh1CMuMxZnP63ryn/Lw8Cguef1L7okz93ROtyQgYQtmNMwplcptKgnFLEcOhWTCjF2fyHfqDnHxTPWl9P+HqQ3VJ/5d5A3YRTIPH8UpQ5FwJhazlKgD1UZDHy2vMIBlp+zyBSX1fmx7NxnFr7ucTCYTkIJX4/0gy4QuFYq4C+u6tI9p2zqA2gHVwvYwsnsCVWesKFzLCtM14ZaSsWkcEN1bTvUunyVMx71ybFvrw7CB1xxW5MtLs7qcG2mQdzFeCbdA2zQ2tVhrCjOU6zFM3VnIn0M9lMCZaHRCMBnTULjJVjYK3rxRjS1v3gyrfC/AG7zrYO6e+3AbvBsQ2QUx8RRMeivx/mXYWYMWigUlYKQ/LRHBvGoflGOV3Gleh6CoUKRJGF2rNKOYDM1a/0bbDyoVWzDhkpUdcIiJP83oPCEkkjXguyfpdXk/PBriZk1tDL8hL8kCheD+DmQKmokFp9G8MgTIiwxFmZNi8RqUe6v4byWLaSbKfE5qo+zfaNpW+9cq4FRcLDMNpW6WhcL4ptl43Gb74v2hCPUG6q3oXsCdRgf3HWWv4Ix0IYWmDfrRkTWUzFrWfMOOxynUZu7r1OnOWbyBcRwYx4FxHHbkgXEcjsID4zgwjgPjODCOQ5odGMeBcRwYx4FxHBjHgXH0fAIWplS9d9864me9BTcnuy07bGlfdV+sCA3NDMu75XxX3rcjQUOAIgGrAcuMRLO51AzVEjW4Eeo3MuFyKgwpQWajXypVjubqdWZMoSdRZKTkeszIpGOpFlFmch6pND46OvrulabaTaN34/cH+3JOqY3MN1ikRtR3iZCG1te5ci+cMr2O8p5mvkM6fE+Hyu4qenT19KnQ/0v2fSvh/tIN+bcsFcilaK2xdaY1w+av6YfGuBdzb8CZuJmtRfTMvQ7e94hV7LKiXrLxuq8AtNOz5vj3vBVxm+3g8uPxxQ8nx+dQd/V8MRYskrekbhkto1cZGpKoR7XKZi57v3vKNFOUdik4J+iHZyzzgpNNY7ZqMfDr2U9juJCQ4w01y86ZGSPnoVWf28ODbWkOSDXRX0fz5a9nU7igvLA9Ri7TG0oeTfbv331zeFC7z5VGhaJRoWRM2oZO2P1Y4O/XIVy/vg7rLeX64Ho9isBadG1tvbZBaPVvqAIPkLVVCvLVVQ0GYOsCZ6OzB+3RSlukbUWHnO9piTqfdqBrRX3wPl5cnHoY/KHNZpit4O3tbo5vXMxtr5kvrfvdBOsPAqqCHg2Ud999+21bFXx94Mva+uMJDagBhc1Gaf2ZSD1+DXQpMJ+zRSlLzatmp5uTiw9NOQrDYu23GReG50Rw+ZMd4ayZoV7NbrlcjhkKrOeGWrOFsFlcR7bvyJu0+Ti+s2YcjPd1gClQkTCzZovpYNJremjf9XyIFI27Nwscu9TmqPdWwD739re+9m3PU5sT/ytL8LULyO1fnqRK5jNFMbFbSmZbLlwf1tuSzv3dpc2Oa6QQ7rJuGq5jy/8tcm9tedTxiZdsuYJ1t6sw9aRdna0KilnKKPHlpEy7J2d/atZUoEIjVUsJXt7nUJ/VSIyX7IYVlDCX2exTND0/mdler45jw25pVvv1YLzjE/fTFspaCPfuGB/WGxbKsFC+iIXynG8yV7KXT0ppg6YLuJdsufSwLV1WYG/7ds30zrxztu3Y92kMKWhIQV90CiqLZCuv3JU/g1fWslQx1cwyR23ADfSC6eWrz2HwvRSGhPHv5RUFZ7EL/d/dCeWjMcXP7kg/CU5Pzi8C9w1+MAmi27dRc9rSkc3L0acmh3+O2ldIz29Y0U7hh7uCYkPJuUFT6u9lQsHkq8PDz3/7LwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Refunds a sale, by ID. For a full refund, do not include the `amount` object in the JSON request body. For a partial refund, include an `amount` object in the JSON request body.
 */
public class SaleRefundRequest extends HttpRequest<DetailedRefund> {

    public SaleRefundRequest(String saleId) {
        super("/v1/payments/sale/{sale_id}/refund?", "POST", DetailedRefund.class);
        try {
            path(path().replace("{sale_id}", URLEncoder.encode(String.valueOf(saleId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public SaleRefundRequest paypalRequestId(String paypalRequestId) {
        header("PayPal-Request-Id", String.valueOf(paypalRequestId));
        return this;
    }
    
    

    public SaleRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
