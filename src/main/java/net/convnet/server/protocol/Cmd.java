package net.convnet.server.protocol;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;
//  0=SERVER_TRANS
//  1=LOGIN
//  2=LOGIN_RESP
//  3=LOGOUT
//  4=LOGOUT_RESP
//  5=RENEW_USER_STATUS
//  6=RENEW_MY_INFO
//  7=RENEW_MY_INFO_RESP
//  8=GET_VERSION_RESP
//  9=GET_SERVER_PORT
// 10=GET_SERVER_PORT_RESP
// 11=REGIST_USER
// 12=REGIST_USER_RESP
// 13=SEND_MSGTO_ID
// 14=SEND_MSGTO_ID_RESP
// 15=GET_FRIEND_INFO
// 16=GET_FRIEND_INFO_RESP
// 17=GET_GROUP_INFO
// 18=GET_GROUP_INFO_RESP
// 19=GET_GROUP_DESC
// 20=GET_GROUP_DESCRESP
// 21=GET_USERINFO
// 22=GET_USERINFO_RESP
// 23=ONLINE_TELL
// 24=ONLINE_TELL_RESP
// 25=OFFLINE_TELL_RESP
// 26=JOIN_GROUP
// 27=JOIN_GROUP_RESP
// 28=MODIFY_GROUP
// 29=MODIFY_GROUP_RESP
// 30=MSG_CAN_TARRIVE
// 31=CREATE_GROUP
// 32=CREATE_GROUP_RESP
// 33=QUIT_GROUP
// 34=QUIT_GROUP_RESP
// 35=KICK_OUT
// 36=KICK_OUT_RESP
// 37=ADD_FRIEND
// 38=ADD_FRIEND_RESP
// 39=DEL_FRIEND
// 40=DEL_FRIEND_RESP
// 41=ORD_SERVER_TRANS
// 42=ORD_SERVER_TRANS_RESP
// 43=PEER_SURE_FRIEND
// 44=PEER_SURE_FRIEND_RESP
// 45=PEER_REFUSED_FRIEND
// 46=PEER_REFUSED_FRIEND_RESP
// 47=PEER_SURE_JOIN_GROUP
// 48=PEER_SURE_JOIN_GROUP_RESP
// 49=PEER_ORD_FRIEND
// 50=PEER_ORD_FRIEND_RESP
// 51=FIND_USER
// 52=FIND_USER_RESP
// 53=FIND_GROUP
// 54=FIND_GROUP_RESP
// 55=CALL_TO_USER
// 56=CALL_TO_USER_RESP
// 57=CALL_TO_USER_NEW_PORT
// 58=CALL_TO_USER_NEW_PORT_RESP
// 59=DISS_CONN_USER
// 60=DISS_CONN_USER_RESP
// 61=IS_CLIENT_UDP
// 62=P2P
// 63=KEEP_ONLINE
// 64=USER_NEED_PASS
// 65=SAMEIP_INFO
// 66=SAMEIP_INFO_RESP
// 67=CHECK_NAT_TYPE
// 68=SERVER_SEND_TO_CLIENT
// 69=SEND_GROUP_MSG
// 70=SEND_GROUP_MSG_RESP
// 71=GROUP_MSG_CAN_TARRIVE
// 72=ERROR
// 73=HANDSHAKE
// 74=NULLPACK
public enum Cmd {
   SERVER_TRANS,
   LOGIN,
   LOGIN_RESP,
   LOGOUT,
   LOGOUT_RESP,
   RENEW_USER_STATUS,
   RENEW_MY_INFO,
   RENEW_MY_INFO_RESP,
   GET_VERSION_RESP,
   GET_SERVER_PORT,
   GET_SERVER_PORT_RESP,
   REGIST_USER,
   REGIST_USER_RESP,
   SEND_MSGTO_ID,
   SEND_MSGTO_ID_RESP,
   GET_FRIEND_INFO,
   GET_FRIEND_INFO_RESP,
   GET_GROUP_INFO,
   GET_GROUP_INFO_RESP,
   GET_GROUP_DESC,
   GET_GROUP_DESCRESP,
   GET_USERINFO,
   GET_USERINFO_RESP,
   ONLINE_TELL,
   ONLINE_TELL_RESP,
   OFFLINE_TELL_RESP,
   JOIN_GROUP,
   JOIN_GROUP_RESP,
   MODIFY_GROUP,
   MODIFY_GROUP_RESP,
   MSG_CAN_TARRIVE,
   CREATE_GROUP,
   CREATE_GROUP_RESP,
   QUIT_GROUP,
   QUIT_GROUP_RESP,
   KICK_OUT,
   KICK_OUT_RESP,
   ADD_FRIEND,
   ADD_FRIEND_RESP,
   DEL_FRIEND,
   DEL_FRIEND_RESP,
   ORD_SERVER_TRANS,
   ORD_SERVER_TRANS_RESP,
   PEER_SURE_FRIEND,
   PEER_SURE_FRIEND_RESP,
   PEER_REFUSED_FRIEND,
   PEER_REFUSED_FRIEND_RESP,
   PEER_SURE_JOIN_GROUP,
   PEER_SURE_JOIN_GROUP_RESP,
   PEER_ORD_FRIEND,
   PEER_ORD_FRIEND_RESP,
   FIND_USER,
   FIND_USER_RESP,
   FIND_GROUP,
   FIND_GROUP_RESP,
   CALL_TO_USER,
   CALL_TO_USER_RESP,
   CALL_TO_USER_NEW_PORT,
   CALL_TO_USER_NEW_PORT_RESP,
   DISS_CONN_USER,
   DISS_CONN_USER_RESP,
   IS_CLIENT_UDP,
   P2P,
   KEEP_ONLINE,
   USER_NEED_PASS,
   SAMEIP_INFO,
   SAMEIP_INFO_RESP,
   CHECK_NAT_TYPE,
   SERVER_SEND_TO_CLIENT,
   SEND_GROUP_MSG,
   SEND_GROUP_MSG_RESP,
   GROUP_MSG_CAN_TARRIVE,
   ERROR,
   HANDSHAKE,
   NULLPACK;

   public static final Set<Cmd> ANONYMOUS_CMDS = Sets.newHashSet(LOGIN, REGIST_USER, HANDSHAKE, KEEP_ONLINE);

   /**
    * 转换对应的命令名称为它的字符串序数（如第一个指令是0）。
    * @return {@link String}
    */
   public String toOrdinal() {
      return String.valueOf(this.ordinal());
   }

   //这里能获取到对应的数据
   public static void main(String[] args) {
      // 获取枚举对象数组
      Cmd[] cmds = Cmd.values();

      // 遍历枚举对象数组
      for (Cmd cmd : cmds) {
         // 使用StringUtils.padLeft方法来对枚举对象的序号进行左侧补齐
         System.out.println(StringUtils.leftPad(String.valueOf(cmd.ordinal()), 3) + "=" + cmd.name());
      }
   }
}
