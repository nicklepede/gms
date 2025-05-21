package com.google.android.gms.backup.base;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import defpackage.ahpv;
import defpackage.ahrf;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.aieb;
import defpackage.aieq;
import defpackage.aifm;
import defpackage.asbo;
import defpackage.brbv;
import defpackage.brrv;
import defpackage.dfee;
import defpackage.dvzc;
import defpackage.dwae;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekid;
import defpackage.ekiw;
import defpackage.fecj;
import defpackage.flkj;
import defpackage.flly;
import defpackage.flog;
import defpackage.flqi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupAccountNotifierIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("BackupAccountNotifier");
    private final eijr b = eijy.a(new eijr() { // from class: ahll
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flkj.a.a().c());
        }
    });
    private ahpv c;
    private asbo d;
    private SharedPreferences e;

    private final void a() {
        this.d.o("com.google.android.backup.notification.account.tag", 1, dfee.BACKUP_SET_ACCOUNT_NOTIFICATION_ID);
        b(3);
        if (!this.e.edit().putBoolean("notified", false).commit()) {
            a.h("Fail to write notification cancellation preference.", new Object[0]);
        }
        if (flly.d()) {
            if (!this.e.edit().putInt("notified_count", 0).commit()) {
                a.h("Fail to write notification count preference.", new Object[0]);
            }
            if (this.e.edit().putLong("notified_timestamp", 0L).commit()) {
                return;
            }
            a.h("Fail to write notification timestamp preference.", new Object[0]);
        }
    }

    private final void b(int i) {
        if (((Boolean) this.b.a()).booleanValue()) {
            fecj c = ahwj.c();
            fecj v = ekid.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ekid ekidVar = (ekid) v.b;
            ekidVar.c = i - 1;
            ekidVar.b |= 1;
            if (!c.b.L()) {
                c.U();
            }
            ekhl ekhlVar = (ekhl) c.b;
            ekid ekidVar2 = (ekid) v.Q();
            ekhl ekhlVar2 = ekhl.a;
            ekidVar2.getClass();
            ekhlVar.K = ekidVar2;
            ekhlVar.c |= 16;
            brbv l = brrv.v().l((ekhl) c.Q());
            l.c = Integer.valueOf(ekhk.BACKUP_ACCOUNT_NOTIFICATION.aM);
            l.a();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = new ahpv(this);
        this.d = asbo.f(this);
        this.e = getSharedPreferences("com.google.android.gms.backup.BackupAccountNotifierService", 0);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        Intent intent2;
        Notification.Builder builder;
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("notify", true);
        ahwd ahwdVar = a;
        ahwdVar.j("Handling new intent. Show notification: %s", Boolean.valueOf(booleanExtra));
        if (!booleanExtra) {
            a();
            return;
        }
        if (!Process.myUserHandle().isOwner() && (!flkj.a.a().d() || Build.VERSION.SDK_INT < 29)) {
            ahwdVar.m("Only owner can see backup notifications", new Object[0]);
        } else if (this.c.k()) {
            aifm.a();
            flqi.d();
            flkj flkjVar = flkj.a;
            boolean b = flkjVar.a().b();
            ahwdVar.j("Shared pref value: " + this.e.getBoolean("notified", false), new Object[0]);
            if (!this.e.getBoolean("notified", false) || b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (flly.d()) {
                    i = this.e.getInt("notified_count", 0);
                    long j = this.e.getLong("notified_timestamp", 0L) + (((Integer) flly.b().b.get(Math.min(i, flly.b().b.size() - 1))).intValue() * 60000);
                    if (currentTimeMillis < j) {
                        ahwdVar.h("Not showing notification - waiting until %d.", Long.valueOf(j));
                        return;
                    }
                } else {
                    i = 0;
                }
                ahwdVar.h("Showing notification.", new Object[0]);
                int i2 = aieq.a;
                if (!ahrf.a()) {
                    intent2 = new Intent();
                    intent2.setClassName(this, "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                    if (getPackageManager().resolveActivity(intent2, 0) == null) {
                        intent2.setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
                    }
                    intent2.putExtra("turnOff", true);
                    intent2.putExtra("showDone", true);
                } else if (flog.a.a().y() && dvzc.g(getPackageManager(), new eijr() { // from class: aiep
                    @Override // defpackage.eijr
                    public final Object a() {
                        int i3 = aieq.a;
                        return 509024;
                    }
                }).f()) {
                    intent2 = aieq.g(ekiw.MISSING_BACKUP_ACCOUNT_NOTIFICATION);
                } else {
                    intent2 = new Intent();
                    intent2.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
                    dwae.c(intent2, ekiw.MISSING_BACKUP_ACCOUNT_NOTIFICATION);
                }
                flly.a.a().q();
                flly fllyVar = flly.a;
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, (true != fllyVar.a().p() ? 0 : 67108864) | 134217728);
                boolean a2 = flkjVar.a().a();
                if (fllyVar.a().o()) {
                    builder = aieb.b(this);
                } else {
                    builder = new Notification.Builder(this);
                    aieb.f(this, builder, "com.google.android.gms.backup.notification.channel.id");
                }
                builder.setPriority(1).setWhen(System.currentTimeMillis()).setContentTitle(getString(R.string.notification_content_title_set_backup_account)).setContentText(getString(R.string.notification_content_text_set_backup_account)).setContentIntent(activity).setOngoing(a2);
                if (flly.e()) {
                    aieb.d(getApplicationContext(), builder);
                } else {
                    builder.setSmallIcon(android.R.drawable.stat_sys_warning);
                }
                this.d.w("com.google.android.backup.notification.account.tag", 1, dfee.BACKUP_SET_ACCOUNT_NOTIFICATION_ID, builder.build());
                b(2);
                if (!this.e.edit().putBoolean("notified", true).commit()) {
                    ahwdVar.m("Failed to write notification preference", new Object[0]);
                }
                if (flly.d()) {
                    if (!this.e.edit().putInt("notified_count", i + 1).commit()) {
                        ahwdVar.m("Failed to write notification preference", new Object[0]);
                    }
                    if (this.e.edit().putLong("notified_timestamp", currentTimeMillis).commit()) {
                        return;
                    }
                    ahwdVar.m("Failed to write notification preference", new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        a();
    }
}
