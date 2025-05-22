package com.google.android.gms.chimera.container.intentoperation;

import com.google.android.chimera.DeviceAdminReceiver;
import defpackage.aqfk;
import defpackage.aqfp;
import defpackage.auub;
import defpackage.bjlm;
import defpackage.elik;
import defpackage.elim;
import defpackage.elon;
import defpackage.iri;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PersistentTrustedChimeraReceiver extends aqfk implements bjlm {
    private static final elim c;

    static {
        List asList = Arrays.asList("android.accounts.LOGIN_ACCOUNTS_CHANGED", DeviceAdminReceiver.ACTION_PASSWORD_CHANGED, "android.app.action.DEVICE_OWNER_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED", "android.app.action.RESET_PROTECTION_POLICY_CHANGED", "android.app.action.STATSD_STARTED", "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.action.LE_AUDIO_ACTIVE_DEVICE_CHANGED", "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.device.action.ACL_CONNECTED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.device.action.ALIAS_CHANGED", "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED", "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.UUID", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED", "android.intent.action.BOOT_COMPLETED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOMAINS_NEED_VERIFICATION", "android.intent.action.LOCALE_CHANGED", "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.MAIN_USER_LOCKSCREEN_KNOWLEDGE_FACTOR_CHANGED", "android.intent.action.MASTER_CLEAR_NOTIFICATION", "android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.NEW_OUTGOING_CALL", "android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_CHANGED", "android.intent.action.PACKAGE_DATA_CLEARED", "android.intent.action.PACKAGE_FULLY_REMOVED", "android.intent.action.PACKAGE_REMOVED", "android.intent.action.PACKAGE_REPLACED", "android.intent.action.SIM_STATE_CHANGED", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.intent.action.USER_INITIALIZE", "android.intent.action.USER_PRESENT", "android.location.MODE_CHANGED", "android.location.PROVIDERS_CHANGED", "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED", "android.net.conn.NETWORK_CONDITIONS_MEASURED", "android.net.wifi.WIFI_AP_STATE_CHANGED", "android.os.UpdateLock.UPDATE_LOCK_CHANGED", "android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT", "android.telephony.action.SIM_CARD_STATE_CHANGED", "com.android.nfc_extras.action.RF_FIELD_OFF_DETECTED", "com.android.nfc_extras.action.RF_FIELD_ON_DETECTED");
        List asList2 = Arrays.asList("android.accounts.action.ACCOUNT_REMOVED", "android.os.action.USER_RESTRICTIONS_CHANGED");
        Arrays.asList("android.safetycenter.action.REFRESH_SAFETY_SOURCES");
        Arrays.asList("android.bluetooth.device.action.KEY_MISSING");
        elik elikVar = new elik(elon.a);
        elikVar.q(asList);
        if (auub.c()) {
            elikVar.q(asList2);
        }
        int i = iri.a;
        c = elikVar.g();
    }

    public PersistentTrustedChimeraReceiver() {
        super(false, c, aqfp.d());
    }
}
