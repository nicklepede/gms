package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.amdl;
import defpackage.amlz;
import defpackage.amma;
import defpackage.amyd;
import defpackage.annb;
import defpackage.iln;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastTermsOfServiceDialogControl$TermsOfServiceDialogReceiver extends TracingBroadcastReceiver {
    final /* synthetic */ amdl a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastTermsOfServiceDialogControl$TermsOfServiceDialogReceiver(amdl amdlVar) {
        super("cast");
        this.a = amdlVar;
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        iln.c(this.a.b, this, new IntentFilter("com.google.android.gms.cast.activity.TOS_DIALOG_ACTION_STATE_CHANGE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        this.b = true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 1);
        if (intExtra == 0) {
            amdl amdlVar = this.a;
            amdlVar.d = 4;
            amdlVar.a.c("TermsOfServiceDialogReceiver got an Intent with DIALOG_OPENED", new Object[0]);
            return;
        }
        amdl amdlVar2 = this.a;
        amdlVar2.d = 1;
        if (this.b) {
            amdlVar2.b.unregisterReceiver(this);
            this.b = false;
        }
        amlz amlzVar = amdlVar2.e;
        if (amlzVar == null || intExtra == 1) {
            amdlVar2.a.c("TermsOfServiceDialogReceiver got an Intent with DIALOG_CLOSED and action result '%d'.", Integer.valueOf(intExtra));
            return;
        }
        if (intExtra != 5) {
            if (intExtra == 6) {
                this.a.e.a();
                return;
            }
            if (intExtra == 7) {
                amdl amdlVar3 = this.a;
                amdlVar3.d = 5;
                amdlVar3.a();
                amdlVar3.e.a();
                return;
            }
            if (!((Boolean) annb.c().i.a()).booleanValue()) {
                this.a.e.a.b();
                return;
            } else {
                this.a.a.p("Received an unexpected action result '%d'! Intent: %s", Integer.valueOf(intExtra), intent.toUri(0));
                return;
            }
        }
        if (intent.getBooleanExtra("com.google.android.gms.cast.activity.DIALOG_KEY_DEVICE_USAGE_REPORTING", true)) {
            long k = amlzVar.a.k();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("request_id", k);
                jSONObject.put("type", "set_stats");
                jSONObject2.put("stats", true);
                jSONObject.put("data", jSONObject2);
                amma ammaVar = amlzVar.a;
                ammaVar.d.n("User opted in to device usage stats collection. Sending message to /setup/set_stats with request_id=%d.", Long.valueOf(k));
                ammaVar.m(jSONObject.toString(), k, amyd.b);
            } catch (JSONException unused) {
                amlzVar.a.d.d("Failed to create message to /setup/set_stats!", new Object[0]);
            }
        }
        amlz amlzVar2 = this.a.e;
        long k2 = amlzVar2.a.k();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("request_id", k2);
            jSONObject3.put("type", "accept_tos");
            amma ammaVar2 = amlzVar2.a;
            ammaVar2.d.n("User accepted Google's terms of service. Sending message to /setup/accept_tos with request_id=%d.", Long.valueOf(k2));
            ammaVar2.m(jSONObject3.toString(), k2, amyd.b);
        } catch (JSONException unused2) {
            amlzVar2.a.d.d("Failed to create message to /setup/accept_tos!", new Object[0]);
        }
        this.a.e.a.a();
    }
}
