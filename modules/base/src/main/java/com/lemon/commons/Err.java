package com.lemon.commons;



public enum Err {
	//------------------fields -------------------------
	OK  	(0, "OK"),

	E401	(401, "（未授权） 请求要求身份验证。"),
	E403	(403, "（禁止） 服务器拒绝请求"),
	E404	(404, "（未找到）服务器找不到请求的资源"),
	
	E500    (500,"发生异常"),

	E1000	(1000, "参数错误或不符要求"),
	E1001	(1001, "用户名或密码错误"),
	E1002	(1002, "用户名已经存在"),
	E1003	(1003, "用户登录失败次数过多，被锁定一小时"),
	E1004	(1004, "用户尚未注册"),
	E1005	(1005, "登录错误"),
	E1006	(1006, "邮箱已被注册"),
	E1007	(1007, "手机号码已被注册"),
	E1008	(1008, "获取文件上传进度失败"),
	E1009	(1009, "创建老师_知识点映射失败"),

	E1010	(1010, "获取知识点列表失败"),
	E1011	(1011, "上传图片路径非法"),
	E1012	(1012, "文件上传失败"),
	E1013	(1013, "教师个人信息没有完善"),
	E1014	(1014, "发送验证短信失败"),
	E1015	(1015, "没有选择教授学科"),
	E1016	(1016, "选择课程失败"),
	E1017	(1017, "完善老师个人信息失败"),
	E1018	(1018, "获取学校、类型参数错误"),
	E1019	(1019, "该区域下没有学校"),

	E1020	(1020, "获取区域ID参数错误"),
	E1021	(1021, "获取区域列表失败"),
	E1022	(1022, "无法发送短信，请联系客服"),
	E1023	(1023, "计算视频观看统计数据遇到错误的参数"),
	E1024	(1024, "发送短信失败"),
	E1025	(1025, "ip无法注册账号，请联系客服"),
	E1026	(1026, "手机已被注册"),
	E1027	(1027, "1分钟后才能再次发送验证短信"),
	E1028	(1028, "保存头像路径失败"),
	E1029	(1029, "wenkuId格式错误"),

	E1030	(1030, "保存教授学科失败"),
	E1031	(1031, "该账号不能登录"),
	E1032	(1032, "登录未知异常"),
	E1033	(1033, "创建班级信息错误"),
	E1034	(1034, "班级创建失败"),
	E1035	(1035, "该级文库下面没有知识点"),
	E1036	(1036, "生成sms_ip失败"),
	E1037	(1037, "登陆超时"),
	E1038	(1038, "修改学校信息失败！"),
	E1039	(1039, "在此页面停留时间过久，请点击浏览器的刷新按钮刷新此页面"),

	//linhui
	E1040	(1040, "不能加入自己创建的班级"),
	E1041	(1041, "已加入该班级，无需重复加入"),
	E1042	(1042, "已申请加入课程，请稍等老师审核"),
	E1043	(1043, "该班级需要验证才能加入"),
	E1044	(1044, "您暂时不能加入该班，可能是因为"),
	E1045	(1045, "资源标题过长，请重新编辑"),
	E1046	(1046, "该资源不存在或已被删除"),
	E1047	(1047, "您已经点过赞了"),
	E1048	(1048, "获取用户视频观看参数错误"),
	E1049	(1049, "当前观看视频不存在！"),
	E1050	(1050, "保存视频播放记录失败"),
	E1051	(1051, "没有权限删除该班"),
	E1052	(1052, "班级中有学生，不能删除该班级"),
	E1053	(1053, "你没有权限分享"),
	E1054	(1054, "分享失败，稍后重试"),
	E1055	(1055, "创建知识节点参数错误"),
	E1056	(1056, "知识节点与教材版本不一致"),
	E1057	(1057, "没有权限创建知识节点"),
	E1058	(1058, "创建知识节点发生错误"),
	E1059	(1059, "当前您没有权限移除学生!"),
	E1060	(1060, "该成员不在您的班级中!"),
	E1061	(1061, "当前您没有权重置学生密码!"),
	E1062	(1062, "该学生不存在或不在您的班级中!"),
	E1063	(1063, "获取申请加入班级参数错误！"),
	E1064	(1064, "班级不存在！"),
	E1065	(1065, "您已经申请加入该班级！"),
	E1066	(1066, "您已经加入到该班级里面！"),
	E1067	(1067, "当前用户不是班级管理员，不能添加学生！"),
	E1068	(1068, "该学生没有申请加入班级！"),
	E1069	(1069, "学生加入班级成功！"),
	E1070	(1070, "该学生已经加入到该班级里面！"),
	E1071	(1071, "该学生已被您从班级删除，无法添加"),
	E1072	(1072, "获取删除班级学生参数错误"),
	E1073	(1073, "将要删除的班级不存在！"),
	E1074	(1074, "当前用户不是班级管理员，不能删除学生！"),
	E1075	(1075, "学生不在班级中，无需删除！"),
	E1076	(1076, "更新用户消息失败"),
	E1077	(1077, "邮箱格式错误"),
	E1078	(1078, "邮件已经发送，5分钟后才能重新发送！"),
	E1079	(1079, "验证邮件发送失败，请稍后重试！"),




	//bob
	E1080  	(1080, "资源未上传或已删除！"),
	E1081	(1081, "media对应的mp4找不到，下载失败！"),
	E1082	(1082, "没有权限删除文件"),
	E1083	(1083, "管理员试图恢复的视频资源在垃圾箱内没找到！"),
	E1084	(1084, "文库科目不存在！"),
	E1085	(1085, "修改入学年份信息失败！"),
	E1086	(1086, "学校或教材版本参数错误！"),
	E1087	(1087, "学校管理员创建文库时发生未知错误！"),
	E1088	(1088, "信息已被锁定,如需修改请联系客服！"),
	E1089	(1089, "修改信息失败，发生未知错误！"),

	E1090	(1090, "获取参数失败，请核实创建用户资料"),
	E1091	(1091, "当前学校未认证"),
	E1092	(1092, "文库中不存在父节点"),
	E1093	(1093, "用户登录失败过多，被锁定一小时"),
	E1094	(1094, "该用户不能登录"),
	E1095	(1095, "用户名或密码错误"),
	E1096	(1096, "该账户尚未注册"),
	E1097	(1097, "登录失败"),
	E1098	(1098, Err.NOT_USED),
	E1099	(1099, Err.NOT_USED),

	//wenpin
	E1100	(1100, "你没有权限操作"),
	E1101	(1101, "查询用户文档失败"),
	E1102	(1102, "资料不存在或不提供下载"),
	E1103	(1103, "文件需要解析"),
	E1104	(1104, "当前用户没有视频"),
	E1105	(1105, "视频已加载完毕"),
	E1106	(1106, "当前班级或知识节点不存在"),
	E1107	(1107, "当前班级不存在该知识节点"),
	E1108	(1108, "区域内没有学校"),
	E1109	(1109, "秘钥已过期，请重新获取！"),
	E1110   (1110, "订单不存在"),
	E1111   (1111, "购买的商品不存在"),
	E1112   (1112, "所选的商品不能购买"),
	E1113   (1113, "该班级不存在或者已删除"),
	E1114   (1114, "你还没有加入该班级"),
	E1115   (1115, "您查询的节点需要付费才能观看"),
	E1116   (1116, "您的登录账号已经绑定过其他微信账号"),
	E1117   (1117, "该节点需要解锁前面的节点才能观看"),

	//linhui
	E1200	(1200, "获取知识树节点资源参数错误！"),
	E1201	(1201, "添加资源到知识节点发生未知错误！"),
	E1202	(1202, "该知识节点不存在！"),
	E1203	(1203, "上传文件成功！"),
	E1204	(1204, "上传文件出错！"),
	E1205	(1205, "获取头像文件名失败！"),
	E1206	(1206, "图片文件超过限制！"),
	E1207	(1207, "获取图片参数错误！"),
	E1208	(1208, "当前用户不存在或未登录！"),
	E1209	(1209, "修改头像失败！"),
	E1210	(1210, "手机号不能为空！"),
	E1211	(1211, "密码格式不正确或参数不完整！"),
	E1212	(1212, "原始密码不正确！"),
	E1213	(1213, "用户名已被注册！"),
	E1214	(1214, "用户尚未登录"),
	E1215	(1215, "学校或文库不存在！"),
	E1216	(1216, "学校或教材版本参数错误"),
	E1217	(1217, "验证码不正确，请重新填写"),
	E1218	(1218, "该资源已经添加到该节点"),
	E1219	(1219, "您已经答该题超过3次，无法答题"),

	E1120	(1120, "当前账户为学生账户,请下载超级讲师学生版，并用该账号登录"),
	E1121	(1121, "当前账户为教师账户,请下载超级讲师老师版，并用该账号登录"),
	E1122	(1122, "当前账户类型不支持，请确定您的账户是老师或者学生，并请下载响应的超级讲师老师版或学生版"),
	E1123   (1123, "您输入的价格不能低于原始价格"),
	E1124   (1124, "土豪悠着点，钱给太多了"),
	E1125   (1125, "输入内容超出范围"),
	E1126   (1126, "评论不存在或者已删除"),
	E1127   (1127, "只有学生或者老师账号才能加入班级"),
	E1128   (1128, "习题集已发布，无法继续添加试题"),
	E1129   (1129, "还没有选择习题，无法发布"),
	E1130   (1130, "请先完善个人信息"),
	E1131   (1131, "需要教师认证"),
	E1132   (1132, "该学生不存在，或者还没有答题！"),
	E1133   (1133, "你的报名信息已提交，不可重复重复报名！"),
	E1134   (1134, "该证件号已经报过名！"),
	E1135   (1135, "缴费班级过期"),
	E1136   (1136, "该证件已经被其他账号报名了"),

	Not_USER			(1600,"该用户已删除或者不存在"),
	No_Acitivity		(1601,"活动已删除或者不存在"),
	Acitivity_Not_Start	(1602,"活动还没有开始"),
	Acitivity_End		(1603,"活动已经结束"),
	Acitvity_Peny		(1604,"您不能参加此活动"),
	Acitvity_Applied	(1605,"您已经报名参加了此活动"),
	Acitvity_ErrorApply	(1606,"您的报名信息有误"),
	User_NeedLogin		(1607,"用户没有登录"),
	Acitvity_NoApply	(1608,"你还没有报名或者报名未审核通过"),
	NOT_Teacher			(1609,"您不是老师"),

	No_StudentAsset		(1610,"没有更多的资源"),
	System_Busy			(1611,"系统繁忙"),
	NOT_Exist			(1612,"指定资源不存在"),
	Peny_Operation		(1613,"你没有权限这么做"),
	No_File				(1614,"您没有选择上传文件"),
	No_Gift				(1615,"礼品抢完了"),
	Cannot_Gift			(1616,"你抽取礼品数用完了"),
	ErrorParam			(1617,"参数有错误"),
	HasSubmit			(1618,"你已经提交过举报，请勿重复提交相同举报"),
	CanGift				(1619,"可以抽奖"),
	SchoolNotFind		(1620,"学校未找到"),
	E1621               (1621,"请自行选择一篇文章"),
	E1622               (1622,"您已经申请过精品视频"),
	E1623               (1623,"这个班级已经申请过精品班级"),
	E1624               (1624,"只有网络班才可以申请"),
	E1625               (1625,"该班级已经结课或者锁班"),
	E1626               (1626,"您的班级不符合申请条件"),
	RecordFaid			(1699,"记录试题视频录制失败"),



	E1800	(1800, "管理员试图恢复的视频资源在垃圾箱内没找到"),


	E3001	(3001, "APP登陆获取用户信息参数错误"),
	E3002	(3002, "APP登陆用户名或密码错误"),
	E3003	(3003, "APP登陆该账户被禁用"),
	E3004	(3004, "APP登陆账户不存在"),
	E3005	(3005, "APP登陆获取用户信息失败"),
	E3006	(3006, "APP注册IP发送短信验证过多"),
	E3007	(3007, "获取APP短信验证请求信息错误"),
	E3008	(3008, "无法发送短信，请联系客服"),
	E3009	(3009, "手机号码已被注册"),

	E3010	(3010, "APP注册发送短信失败"),
	E3011	(3011, "APP注册1分钟后才能再次发送验证短信"),
	E3012	(3012, "APP登陆获取信息参数错误"),
	E3013	(3013, "APP登陆手机或密码错误"),
	E3014	(3014, "APP登陆该用户尚未注册"),
	E3015	(3015, "APP注册获取用户信息参数错误或信息不合法"),
	E3016	(3016, "APP注册手机号码已被注册"),
	E3017	(3017, "APP获取区域参数错误"),
	E3018	(3018, "APP获取区域列表失败"),
	E3019	(3019, "该区域没有下属区域"),

	E3020	(3020, "获取学校区域参数错误"),
	E3021	(3021, "该区域下没有学校"),
	E3022	(3022, "登陆异常，请稍后重试"),
	E3023	(3023, "获取Token失败"),
	E3024	(3024, "学校ID不存在"),
	E3025	(3025, "获取更新信息参数失败"),
	E3026	(3026, "不存在该APP的更新信息"),
	E3027	(3027, "查询APP版本错误，请稍后重试"),
	E3028	(3028, "您已经是最新版本啦！"),
	E3029	(3029, "视频上传用户不存在!"),

	E3030	(3030, "接收视频上传参数错误!"),
	E3031	(3031, "接收视频文件失败!"),
	E3032	(3032, "获取文库信息参数错误！"),
	E3033	(3033, "获取文库列表失败!"),
	E3034	(3034, "提交问题反馈信息图片文件超过5M！"),
	E3035	(3035, "提交问题反馈信息失败！"),
	E3036	(3036, "获取用户反馈问题信息错误！"),
	E3037	(3037, "获取手机验证码参数错误"),
	E3038	(3038, "验证码已过期，请重新获取！"),
	E3039	(3039, "验证码错误！"),

	E3040	(3040, "检查验证码失败，请稍后重试！"),
	E3041	(3041, "获取手机验证码参数错误！"),
	E3042	(3042, "验证码错误或不存在！"),
	E3043	(3043, "该手机用户不存在！"),
	E3044	(3044, "修改密码失败！"),
	E3045	(3045, "获取客服信息失败"),
	E3046	(3046, "获取用户年级参数错误"),
	E3047	(3047, "修改年级信息失败"),
	E3048	(3048, "获取用户学段参数错误"),
	E3049	(3049, "修改学段信息失败"),

	E3050	(3050, "获取用户邮箱参数错误"),
	E3051	(3051, "邮箱已被注册"),
	E3052	(3052, "验证邮件发送失败"),
	E3053	(3053, "获取学段年级信息失败"),
	E3054	(3054, "当前视频不存在！"),
	E3055	(3055, "查询课程信息失败"),
	E3056	(3056, "获取头像文件名失败！"),
	E3057	(3057, "用户不存在！"),
	E3058	(3058, "提交问题反馈信息图片文件超过100M！"),

	E3060	(3060, "获取评价连接失败！"),
	E3061	(3061, "当前用户没有权限修改！"),
	E3062	(3062, "暂无需要转换的视频"),
	E3063	(3063, "获取待转换视频时发生未知异常"),
	E3064	(3064, "更新视频转换状态失败"),
	E3065   (3065, "该视频需要购买"),
	E3066   (3066, "精品视频无法设置价格"),
	E3067   (3067, "不支持的支付方式"),
	E3068   (3068, "您已通过认证，无需重复认证！"),
	E3069   (3069, "视频文件尚未上传完整"),
	
	E3070   (3070, "该学校已有用户，不能删除"),
	E3071   (3071, "您还没有建立资源库"),
	E3072   (3072, "创建班级的参数错误"),
	E3073   (3073, "您当前没有权限为该老师创建班级"),
	E3074   (3074, "当前资源没有该权限"),
	E3075   (3075, "您没有权限往该班级内增加老师"),
	E3076   (3076, "该老师不能加入该班级或已加入该班级"),
	E3077   (3077, "该信息不存在！"),
	E3078   (3078, "个人信息参数错误！"),
    E3079   (3079, "个人姓名格式错误！"),
    
    E3080   (3080, "班级不存在或没有权限操作该班级！"),
    E3081   (3081, "班级操作未知！"),
    E3082   (3082, "昵称格式不正确！"),
    E3083   (3083, "状态码不存在！"),
    E3084   (3084, "查询IP信息失败！"),
    E3085   (3085, "用户名或密码参数错误"),
    E3086   (3086, "获取视频文件时长错误"),
    E3087	(3087, "第三方数据签名有误"),
    E3088	(3088, "注册用户信息重复"),
    E3089	(3089, "注册用户名重复"),
    
    E3090	(3090, "注册手机号重复"),
    E3091	(3091, "连接因请求时间过长断开"),
    E3092	(3092, "班级不存在或者你没有加入该班级"),
    E3093	(3093, "该题不存在"),
    E3094	(3094, "没有该习题集，或者还没有发布"),
	E3095 	(3095, "该考生已录入"),
	E3096	(3096, "该功能仅限合作学校的老师或付费用户使用"),
    E3097	(3097, "发生跳转"),
	E3098	(3098, "用户组码重复，用户需再次请求"),

    //  资源库
    E3100   (3100,"资源库根文件已存在"),
    E3101   (3101,"用户还未创建根文件"),
    E3102   (3102,"目录不存在"),
    E3103   (3103,"存在重名文件"),
    E3104   (3104,"创建文件夹失败"),
	E3105   (3105,"云空间不足"),
	E3106   (3106,"每次添加不能超过10个资源"),
	E3107   (3107,"添加多个资源，是否确定添加？"),
	E3108   (3108,"移动文件有错误信息"),

	E4000	(4000, "栏目不存在"),
	E4001	(4001, "组织机构申请失败"),
	Unknown (9999,"发生未知错误！");


	//------------------instance methods -------------------------
	public final static String NOT_USED = "该错误代码未使用";
	public int num;
	public String msg;
	private Err(int num, String msg) {
		this.num = num;
		this.msg = msg;
	}

}
