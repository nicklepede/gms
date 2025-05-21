package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.bxdd;
import defpackage.bxdg;
import defpackage.cewl;
import defpackage.cfao;
import defpackage.cmaz;
import defpackage.cmci;
import defpackage.cmdb;
import defpackage.cmdh;
import defpackage.cmfe;
import defpackage.cmts;
import defpackage.cnau;
import defpackage.crmv;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.exxh;
import defpackage.exxi;
import defpackage.exzg;
import defpackage.fecj;
import defpackage.fqmf;
import j$.util.Objects;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NotificationChimeraBroadcastReceiver extends IntentOperation {
    public cmaz a;
    public cfao b;
    private cmts c;

    public NotificationChimeraBroadcastReceiver() {
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = cewl.e(this);
        this.b = new cfao(this);
        this.c = new cmts(getApplicationContext(), asnz.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long J;
        if (fqmf.bd()) {
            String action = intent.getAction();
            if (action == null) {
                cmfe.a.b().p("Received unexpected broadcast with no action", new Object[0]);
                return;
            }
            boolean z = true;
            if ("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(action) && "nearby_sharing_alert".equals(intent.getStringExtra("channel_id"))) {
                cmts cmtsVar = this.c;
                asnv asnvVar = cmtsVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bxdg.b(cmtsVar.a(), "most_recent_notification_dismissed_timestamp", 0L) < TimeUnit.SECONDS.toMillis(fqmf.a.a().R())) {
                    J = TimeUnit.SECONDS.toMillis(fqmf.I()) + currentTimeMillis;
                } else {
                    z = false;
                    J = fqmf.J() + currentTimeMillis;
                }
                bxdd c = cmtsVar.a().c();
                c.g("most_recent_notification_dismissed_timestamp", currentTimeMillis);
                c.e("enable_long_timeout_for_hide_dismissed_notification", z);
                bxdg.g(c);
                String format = DateFormat.getDateTimeInstance().format(new Date(J));
                cmdb cmdbVar = cmtsVar.b;
                fecj L = cmdh.L(30);
                exxh exxhVar = exxh.a;
                if (!L.b.L()) {
                    L.U();
                }
                exzg exzgVar = (exzg) L.b;
                exzg exzgVar2 = exzg.a;
                exxhVar.getClass();
                exzgVar.G = exxhVar;
                exzgVar.c |= 2;
                cmdbVar.i(new cmci((exzg) L.Q()));
                cmfe.a.b().h("User dismissed the fast init notification. Not showing the notification until %s.", format);
                return;
            }
            if ("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(action) && "nearby_sharing_privacy".equals(intent.getStringExtra("channel_id"))) {
                cmdb f = cmdb.f(this);
                fecj L2 = cmdh.L(33);
                exxi exxiVar = exxi.a;
                if (!L2.b.L()) {
                    L2.U();
                }
                exzg exzgVar3 = (exzg) L2.b;
                exzg exzgVar4 = exzg.a;
                exxiVar.getClass();
                exzgVar3.H = exxiVar;
                exzgVar3.c |= 8;
                f.i(new cmci((exzg) L2.Q()));
            }
            char c2 = 65535;
            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_STOP_SHOW_PRIVACY_NOTIFICATION") && Objects.equals(intent.getStringExtra("channel_id"), "nearby_sharing_privacy")) {
                crmv.a(getApplicationContext(), true);
                this.b.e("nearby_sharing", intent.getIntExtra("notification_id", -1));
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
            if (byteArrayExtra == null) {
                cmfe.a.b().p("Received unexpected broadcast with no share target", new Object[0]);
                return;
            }
            try {
                final ShareTarget shareTarget = (ShareTarget) cnau.b(byteArrayExtra, ShareTarget.CREATOR);
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
                    this.a.a(shareTarget).y(new dfah() { // from class: clxc
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
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
                        dfaq F = this.a.F();
                        F.z(new dfak() { // from class: clxd
                            @Override // defpackage.dfak
                            public final void gn(Object obj) {
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
                        F.y(new dfah() { // from class: clxe
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                cmfe.a.e().f(exc).p("Failed to get share targets.", new Object[0]);
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
                            cmfe.a.b().f(e).p("Failed to send pendingIntent.", new Object[0]);
                        }
                    }
                    sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                this.b.e("nearby_sharing", intExtra);
            } catch (IllegalArgumentException e2) {
                cmfe.a.b().f(e2).p("Received unexpected broadcast with invalid share target", new Object[0]);
            }
        }
    }

    NotificationChimeraBroadcastReceiver(cmaz cmazVar, cfao cfaoVar, cmts cmtsVar) {
        this.a = cmazVar;
        this.b = cfaoVar;
        this.c = cmtsVar;
    }
}
