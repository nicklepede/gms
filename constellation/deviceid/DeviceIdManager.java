package com.google.android.gms.constellation.deviceid;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.asqx;
import defpackage.asxi;
import defpackage.atlw;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.enwb;
import defpackage.enwd;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DeviceIdManager extends IntentOperation {
    private static final arxo a = atmg.a("device_id_manager");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ResultReceiver resultReceiver;
        arxo arxoVar = a;
        arxoVar.d("Received intent on DeviceIdManager", new Object[0]);
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.gms.constellation.ACQUIRE_PRIMARY_DEVICE_ID")) {
            arxoVar.m("Unsupported action: %s", asqx.c(action));
            return;
        }
        arxoVar.d("Received ACQUIRE_PRIMARY_DEVICE_ID intent", new Object[0]);
        String stringExtra = intent.getStringExtra("deviceidmanager.session_id");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = UUID.randomUUID().toString();
        }
        atmc atmcVar = new atmc(stringExtra);
        atlw a2 = atlw.a(getApplicationContext());
        try {
            resultReceiver = (ResultReceiver) intent.getParcelableExtra("deviceidmanager.on_sync_complete_callback_key");
        } catch (BadParcelableException e) {
            a.g("BadparcelableException for resultReceiver: ", e, new Object[0]);
            resultReceiver = null;
        }
        if (resultReceiver == null) {
            a.m("No receivier to notify, ignoring request", new Object[0]);
            a2.o(atmcVar, enwd.NULL_RESULT_RECEIVER);
            return;
        }
        if (!asxi.c(getApplicationContext()).f()) {
            a.m("Not primary user, ignoring request", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putSerializable("failure_verification_exception_key", new atmb(enwb.FETCH_DEVICE_ID_NOT_PRIMARY, false));
            resultReceiver.send(0, bundle);
            return;
        }
        long a3 = asxi.c(getApplicationContext()).a();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("device_id_key", a3);
        resultReceiver.send(6, bundle2);
        a.d("Sent device id to result receiver", new Object[0]);
    }
}
