package com.it211_ss09_01;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlashSalesService {

    public void applyDiscount(String userId, String code) {
        log.info("Dang xu ly ma: {} cho user: {}", code, userId);
        try {
            log.info("Thanh cong!");
        } catch (Exception e) {
            log.error("Loi roi!", e);
        }
    }
}
