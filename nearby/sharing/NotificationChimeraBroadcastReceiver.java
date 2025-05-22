package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.bzlt;
import defpackage.bzlw;
import defpackage.chdw;
import defpackage.chhz;
import defpackage.cojh;
import defpackage.cokq;
import defpackage.colj;
import defpackage.colp;
import defpackage.conm;
import defpackage.cpca;
import defpackage.cpjc;
import defpackage.ctwa;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.falt;
import defpackage.falu;
import defpackage.fans;
import defpackage.fgrc;
import defpackage.ftga;
import j$.util.Objects;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NotificationChimeraBroadcastReceiver extends IntentOperation {
    public cojh a;
    public chhz b;
    private cpca c;

    public NotificationChimeraBroadcastReceiver() {
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = chdw.e(this);
        this.b = new chhz(this);
        this.c = new cpca(getApplicationContext(), aurt.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long J;
        if (ftga.be()) {
            String action = intent.getAction();
            if (action == null) {
                conm.a.b().p("Received unexpected broadcast with no action", new Object[0]);
                return;
            }
            boolean z = true;
            if ("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(action) && "nearby_sharing_alert".equals(intent.getStringExtra("channel_id"))) {
                cpca cpcaVar = this.c;
                aurp aurpVar = cpcaVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bzlw.b(cpcaVar.a(), "most_recent_notification_dismissed_timestamp", 0L) < TimeUnit.SECONDS.toMillis(ftga.a.lK().U())) {
                    J = TimeUnit.SECONDS.toMillis(ftga.I()) + currentTimeMillis;
                } else {
                    z = false;
                    J = ftga.J() + currentTimeMillis;
                }
                bzlt c = cpcaVar.a().c();
                c.g("most_recent_notification_dismissed_timestamp", currentTimeMillis);
                c.e("enable_long_timeout_for_hide_dismissed_notification", z);
                bzlw.g(c);
                String format = DateFormat.getDateTimeInstance().format(new Date(J));
                colj coljVar = cpcaVar.b;
                fgrc L = colp.L(30);
                falt faltVar = falt.a;
                if (!L.b.L()) {
                    L.U();
                }
                fans fansVar = (fans) L.b;
                fans fansVar2 = fans.a;
                faltVar.getClass();
                fansVar.G = faltVar;
                fansVar.c |= 2;
                coljVar.i(new cokq((fans) L.Q()));
                conm.a.b().h("User dismissed the fast init notification. Not showing the notification until %s.", format);
                return;
            }
            if ("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(action) && "nearby_sharing_privacy".equals(intent.getStringExtra("channel_id"))) {
                colj f = colj.f(this);
                fgrc L2 = colp.L(33);
                falu faluVar = falu.a;
                if (!L2.b.L()) {
                    L2.U();
                }
                fans fansVar3 = (fans) L2.b;
                fans fansVar4 = fans.a;
                faluVar.getClass();
                fansVar3.H = faluVar;
                fansVar3.c |= 8;
                f.i(new cokq((fans) L2.Q()));
            }
            char c2 = 65535;
            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_STOP_SHOW_PRIVACY_NOTIFICATION") && Objects.equals(intent.getStringExtra("channel_id"), "nearby_sharing_privacy")) {
                ctwa.a(getApplicationContext(), true);
                this.b.e("nearby_sharing", intent.getIntExtra("notification_id", -1));
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
            if (byteArrayExtra == null) {
                conm.a.b().p("Received unexpected broadcast with no share target", new Object[0]);
                return;
            }
            try {
                final ShareTarget shareTarget = (ShareTarget) cpjc.b(byteArrayExtra, ShareTarget.CREATOR);
                final int intExtra = intent.getIntExtra("notification_id", -1);
                switch (action.hashCode()) {
                    case -1796513094:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_DISMISS")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1258243400:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_ACCEPT")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1202506710:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_CANCEL")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -815379811:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_CLICK_ACTION")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -769492657:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_REJECT")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 119790586:
                        if (action.equals("com.google.android.gms.nearby.sharing.ACTION_OPEN")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    this.a.a(shareTarget).y(new dhln() { // from class: cofk
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
                            NotificationChimeraBroadcastReceiver.this.b.e("nearby_sharing", intExtra);
                        }
                    });
                    return;
                }
                if (c2 == 1) {
                    this.a.u(shareTarget);
                } else if (c2 == 2 || c2 == 3) {
                    if (shareTarget.f) {
                        this.a.b(shareTarget);
                    } else {
                        dhlw F = this.a.F();
                        F.z(new dhlq() { // from class: cofl
                            @Override // defpackage.dhlq
                            public final void gC(Object obj) {
                                Map map = (Map) obj;
                                for (ShareTarget shareTarget2 : map.keySet()) {
                                    ShareTarget shareTarget3 = shareTarget;
                                    TransferMetadata transferMetadata = (TransferMetadata) map.get(shareTarget3);
                                    if (transferMetadata != null && !transferMetadata.e) {
                                        NotificationChimeraBroadcastReceiver.this.a.b(shareTarget2);
                                    }
                                }
                            }
                        });
                        F.y(new dhln() { // from class: cofm
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                conm.a.e().f(exc).p("Failed to get share targets.", new Object[0]);
                            }
                        });
                    }
                } else if (c2 == 4) {
                    this.a.p(shareTarget);
                } else if (c2 == 5) {
                    PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("share_pending_intent");
                    if (pendingIntent != null) {
                        try {
                            pendingIntent.send();
                        } catch (PendingIntent.CanceledException e) {
                            conm.a.b().f(e).p("Failed to send pendingIntent.", new Object[0]);
                        }
                    }
                    sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                this.b.e("nearby_sharing", intExtra);
            } catch (IllegalArgumentException e2) {
                conm.a.b().f(e2).p("Received unexpected broadcast with invalid share target", new Object[0]);
            }
        }
    }

    NotificationChimeraBroadcastReceiver(cojh cojhVar, chhz chhzVar, cpca cpcaVar) {
        this.a = cojhVar;
        this.b = chhzVar;
        this.c = cpcaVar;
    }
}
