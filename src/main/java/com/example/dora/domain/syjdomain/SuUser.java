package com.example.dora.domain.syjdomain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * APP用户记录主表
 * </p>
 *
 * @author system
 * @since 2019-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SuUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer cardNumber;

    /**
     * 注册手机号
     */
    private String mobile;

    /**
     * 会员等级 0:普通会员1:VIP会员2:店长3:合伙人
     */
    private Integer vipType;

    /**
     * vip赠送红包期数
     */
    private Integer vipRedCount;

    /**
     * 余额
     */
    private Float money;
    /**
     * 朵拉贝
     */
    private Float doraMoney;

    /**
     * 货款
     */
    private Float hkMoney;

    /**
     * 释放货款
     */
    private Float sfMoney;

    /**
     * 冻结金额
     */
    private Float djMoney;

    /**
     * 可退货款金额
     */
    private Float backHkMoney;

    /**
     * 预估余额
     */
    private Float ygMoney;

    /**
     * 个人业绩累计，用于计算何时可以发放奖金，利润的条件
     */
    private Float yjSumMoney;

    /**
     * 保证金
     */
    private Float bzjMoney;

    /**
     * 礼品卡金额
     */
    private Float giftMoney;

    /**
     * 礼金卡现金比
     */
    private Float giftMoneyRatio;

    /**
     * 登录密码
     */
    private String loginPwd;

    /**
     * 提现密码
     */
    private String payPass;

    /**
     * 用户昵称
     */
    private String realname;

    /**
     * 店长设置备注名称
     */
    private String dzRealname;

    /**
     * 用户头像
     */
    private String avatarImg;

    /**
     * 中石化油卡号
     */
    private String ykNumber;

    /**
     * 中石油油卡号
     */
    private String zshYkNumber;

    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 职业
     */
    private Long profession;

    /**
     * 行业
     */
    private Long vocation;

    /**
     * 开户行省
     */
    private String proviceName;

    /**
     * 开户行市
     */
    private String cityName;

    /**
     * 身份证号码
     */
    private String cardid;

    /**
     * 正式姓名
     */
    private String accountName;

    /**
     * 银行卡号
     */
    private String bankCardNumber;

    /**
     * 银行开户行
     */
    private String bankOpenName;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行卡预留手机号
     */
    private String bankPhone;

    /**
     * 爱员工接口保留的身份证id
     */
    private String aygCardid;

    /**
     * 爱员工保存的开户名称
     */
    private String aygAccountName;

    /**
     * 爱员工保存的银行卡号
     */
    private String aygBankCardNumber;

    /**
     * 爱员工保存的开户行
     */
    private String aygOpenName;

    /**
     * 爱员工保存的银行名称
     */
    private String aygBankName;

    /**
     * 爱员工保存的银行预留手机号
     */
    private String aygBankPhone;

    /**
     * 可提货款提现身份证号
     */
    private String backHkCardid;

    /**
     * 可提货款提现姓名
     */
    private String backHkAccountName;

    /**
     * 可提货款提现银行卡号
     */
    private String backHkBankCardNumber;

    /**
     * 可提货款提现支行名
     */
    private String backHkBankOpenName;

    /**
     * 可提货款提现银行名称
     */
    private String backHkBankName;

    /**
     * 可提货款提现手机号码
     */
    private String backHkBankPhone;

    private String backProviceName;

    private String backCityName;

    private Float balance;

    private Float rewardsBalance;

    private Float regBalance;

    /**
     * 授权ID
     */
    private String authId;

    /**
     * 授权登陆方式
     */
    private String authType;

    /**
     * 极光推送id
     */
    private String regId;

    private Integer isLqred;

    /**
     * 抽奖次数
     */
    private Integer isCj;

    /**
     * 抽奖次数
     */
    private Integer cjNum;

    /**
     * 记录当天用户弹窗是否打开  1 打开 0关闭
     */
    private Integer isOpen;

    /**
     * 是否是新人 0/NULL都不是,1是新人
     */
    private Integer isNew;

    /**
     * 免邮次数
     */
    private Integer myNum;

    /**
     * 是否开启免密(0,关闭;1,开启)
     */
    private Integer mmOpen;

    /**
     * 免密金额
     */
    private Float mmMoney;

    /**
     * rokid账号
     */
    private String rokidAccount;

    private String rokidDeviceId;

    private String rokidDeviceType;

    /**
     * 商超系统是否开启(1:开启;2:关闭)
     */
    private Integer scOpen;

    private Date createDateTime;

    private Date updateTime;

    /**
     * 最后登陆时间
     */
    private Date loginTime;

    /**
     * 最后一次确认收货时间
     */
    private Date lastShopingTime;

    /**
     * 用呗授信状态 0:正常，1：冻结
     */
    private Integer djStatus;

    /**
     * 邀请码
     */
    private String fxCode;

    /**
     * 1:达人 2:经理 3:合伙人
     */
    private Integer fxLeve;

    /**
     * 直推人数
     */
    private Integer fxZtCount;

    /**
     * 间接团队人数
     */
    private Integer fxJjCount;

    /**
     * 直推经理人数
     */
    private Integer fxZtjlCount;

    /**
     * 是否变更推荐人(1:已变更)
     */
    private Integer isBgTjr;

    /**
     * 收款二维码
     */
    private String dzPayImg;

    /**
     * 收款账号
     */
    private String dzPayNum;

    /**
     * 收款人姓名
     */
    private String dzPayName;

    /**
     * 微信帐号
     */
    private String wxNumber;

    /**
     * 微信昵称
     */
    private String wxNickname;

    /**
     * 微信身份二维码
     */
    private String wxEwm;

    /**
     * 第一人脉
     */
    private Integer firstBa;

    /**
     * 第二人脉
     */
    private Integer secondBa;

    /**
     * 是否初始化过余额转可退货款1:已转
     */
    private Integer initMoney;

    /**
     * 工猫电签结果0:未电签 1:电签通过 2:电签失败
     */
    private Integer gmDqStatus;

    /**
     * 爱员工电签结果0:未电签 1:电签通过 2:电签失败
     */
    private Integer aygDqStatus;

    /**
     * 1:正常 2：冻结
     */
    private Integer status;

    /**
     * 提现锁定状态:1锁定
     */
    private Integer txDzStatus;

    /**
     * 提现锁定状态:1锁定
     */
    private Integer txHkStatus;

    /**
     * 退身份锁定 1:锁定
     */
    private Integer backDzStatus;

    private Integer invalid;

    /**
     * 直推店长数
     */
    private Integer ztdzCount;

    /**
     * 间推店长数
     */
    private Integer jtdzCount;

    /**
     * 中喜实名认证相关字段
     * 实名认证身份证号
     */
    private String certificationCardId;

    /**
     * 实名认证姓名
     */
    private String certificationAccountName;

    /**
     * 身份证照片a面
     */
    private String certificationCardA;

    /**
     * 身份证照片b面
     */
    private String certificationCardB;

    /**
     * 实名认证状态:0，未验证1，已验证
     */
    private Boolean certificationStatus;

    /**
     * 线下店主状态 5正常 6已解约
     */
    private Integer unOnlineShopper;

    /**
     * 是账号类型(0:普通账号,1:后台非官方账号,2:后台官方账号)
     */
    private Integer isOfficial;

    /**
     * 粉丝数
     */
    private Integer fansNum;
    /**
     * 推荐时间
     */
    private Date tjTime;

    /**
     * 线下店主型 1:旗舰店 2：样板间 3：体验店
     */
    private Integer shopType;

    private Date recedeTime;

    private Integer vipGiftStatus;

    /**
     *样衣订单首单完成情况0,未完成;1,已完成
     */
    private Integer yyFirstFinish;

    /**
     * 0,不是第一批;1,是第一批
     */
    private Integer xxdShopperMark;
    //货款超过1000连续天数
    private Long continuityDay;
    //上一次登记时间
    private Date lastRegisterDate;
    private Integer isDressConsultant;
    private String fwBusinessIds;
    /**
     * 提现的支付宝账号
     */
    private String alipayAccount;
    /**
     * 禁止下单的截止时间
     */
    private  Date closeOrderTime;
    /**
     * 禁止下单的备注
     */
    private String closeOrderMemo;
}
