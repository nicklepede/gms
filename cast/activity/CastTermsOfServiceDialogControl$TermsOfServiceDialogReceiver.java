package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aoew;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aozo;
import defpackage.apou;
import defpackage.ind;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastTermsOfServiceDialogControl$TermsOfServiceDialogReceiver extends TracingBroadcastReceiver {
    final /* synthetic */ aoew a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastTermsOfServiceDialogControl$TermsOfServiceDialogReceiver(aoew aoewVar) {
        super("cast");
        this.a = aoewVar;
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        ind.c(this.a.b, this, new IntentFilter("com.google.android.gms.cast.activity.TOS_DIALOG_ACTION_STATE_CHANGE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        this.b = true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 1);
        if (intExtra == 0) {
            aoew aoewVar = this.a;
            aoewVar.d = 5;
            aoewVar.a.c("TermsOfServiceDialogReceiver got an Intent with DIALOG_OPENED", new Object[0]);
            return;
        }
        aoew aoewVar2 = this.a;
        aoewVar2.d = 2;
        if (this.b) {
            aoewVar2.b.unregisterReceiver(this);
            this.b = false;
        }
        aonk aonkVar = aoewVar2.e;
        if (aonkVar == null || intExtra == 1) {
            aoewVar2.a.c("TermsOfServiceDialogReceiver got an Intent with DIALOG_CLOSED and action result '%d'.", Integer.valueOf(intExtra));
            return;
        }
        if (intExtra != 5) {
            if (intExtra == 6) {
                this.a.e.a();
                return;
            }
            if (intExtra == 7) {
                aoew aoewVar3 = this.a;
                aoewVar3.d = 6;
                aoewVar3.a();
                aoewVar3.e.a();
                return;
            }
            if (!((Boolean) apou.c().i.lK()).booleanValue()) {
                this.a.e.a.b();
                return;
            } else {
                this.a.a.p("Received an unexpected action result '%d'! Intent: %s", Integer.valueOf(intExtra), intent.toUri(0));
                return;
            }
        }
        if (intent.getBooleanExtra("com.google.android.gms.cast.activity.DIALOG_KEY_DEVICE_USAGE_REPORTING", true)) {
            long k = aonkVar.a.k();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("request_id", k);
                jSONObject.put("type", "set_stats");
                jSONObject2.put("stats", true);
                jSONObject.put("data", jSONObject2);
                aonl aonlVar = aonkVar.a;
                aonlVar.d.n("User opted in to device usage stats collection. Sending message to /setup/set_stats with request_id=%d.", Long.valueOf(k));
                aonlVar.m(jSONObject.toString(), k, aozo.b);
            } catch (JSONException unused) {
                aonkVar.a.d.d("Failed to create message to /setup/set_stats!", new Object[0]);
            }
        }
        aonk aonkVar2 = this.a.e;
        long k2 = aonkVar2.a.k();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("request_id", k2);
            jSONObject3.put("type", "accept_tos");
            aonl aonlVar2 = aonkVar2.a;
            aonlVar2.d.n("User accepted Google's terms of service. Sending message to /setup/accept_tos with request_id=%d.", Long.valueOf(k2));
            aonlVar2.m(jSONObject3.toString(), k2, aozo.b);
        } catch (JSONException unused2) {
            aonkVar2.a.d.d("Failed to create message to /setup/accept_tos!", new Object[0]);
        }
        this.a.e.a.a();
    }
}
