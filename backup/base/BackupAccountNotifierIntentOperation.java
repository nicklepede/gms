package com.google.android.gms.backup.base;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import defpackage.ajql;
import defpackage.ajrv;
import defpackage.ajwt;
import defpackage.ajwz;
import defpackage.aker;
import defpackage.akfg;
import defpackage.akgc;
import defpackage.aued;
import defpackage.btjm;
import defpackage.btzq;
import defpackage.dhpk;
import defpackage.dyld;
import defpackage.dymf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emvp;
import defpackage.emwi;
import defpackage.fgrc;
import defpackage.fobt;
import defpackage.fodi;
import defpackage.fofq;
import defpackage.fohs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupAccountNotifierIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("BackupAccountNotifier");
    private final ekww b = ekxd.a(new ekww() { // from class: ajmb
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fobt.a.lK().c());
        }
    });
    private ajql c;
    private aued d;
    private SharedPreferences e;

    private final void a() {
        this.d.o("com.google.android.backup.notification.account.tag", 1, dhpk.BACKUP_SET_ACCOUNT_NOTIFICATION_ID);
        b(3);
        if (!this.e.edit().putBoolean("notified", false).commit()) {
            a.h("Fail to write notification cancellation preference.", new Object[0]);
        }
        if (fodi.d()) {
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
        if (((Boolean) this.b.lK()).booleanValue()) {
            fgrc c = ajwz.c();
            fgrc v = emvp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            emvp emvpVar = (emvp) v.b;
            emvpVar.c = i - 1;
            emvpVar.b |= 1;
            if (!c.b.L()) {
                c.U();
            }
            emux emuxVar = (emux) c.b;
            emvp emvpVar2 = (emvp) v.Q();
            emux emuxVar2 = emux.a;
            emvpVar2.getClass();
            emuxVar.K = emvpVar2;
            emuxVar.c |= 16;
            btjm l = btzq.v().l((emux) c.Q());
            l.c = Integer.valueOf(emuw.BACKUP_ACCOUNT_NOTIFICATION.aM);
            l.a();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = new ajql(this);
        this.d = aued.f(this);
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
        ajwt ajwtVar = a;
        ajwtVar.j("Handling new intent. Show notification: %s", Boolean.valueOf(booleanExtra));
        if (!booleanExtra) {
            a();
            return;
        }
        if (!Process.myUserHandle().isOwner() && (!fobt.a.lK().d() || Build.VERSION.SDK_INT < 29)) {
            ajwtVar.m("Only owner can see backup notifications", new Object[0]);
        } else if (this.c.j()) {
            akgc.a();
            fohs.d();
            fobt fobtVar = fobt.a;
            boolean b = fobtVar.lK().b();
            ajwtVar.j("Shared pref value: " + this.e.getBoolean("notified", false), new Object[0]);
            if (!this.e.getBoolean("notified", false) || b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (fodi.d()) {
                    i = this.e.getInt("notified_count", 0);
                    long j = this.e.getLong("notified_timestamp", 0L) + (((Integer) fodi.b().b.get(Math.min(i, fodi.b().b.size() - 1))).intValue() * 60000);
                    if (currentTimeMillis < j) {
                        ajwtVar.h("Not showing notification - waiting until %d.", Long.valueOf(j));
                        return;
                    }
                } else {
                    i = 0;
                }
                ajwtVar.h("Showing notification.", new Object[0]);
                int i2 = akfg.a;
                if (!ajrv.a()) {
                    intent2 = new Intent();
                    intent2.setClassName(this, "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                    if (getPackageManager().resolveActivity(intent2, 0) == null) {
                        intent2.setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
                    }
                    intent2.putExtra("turnOff", true);
                    intent2.putExtra("showDone", true);
                } else if (fofq.a.lK().y() && dyld.g(getPackageManager(), new ekww() { // from class: akff
                    @Override // defpackage.ekww
                    public final Object lK() {
                        int i3 = akfg.a;
                        return 509024;
                    }
                }).f()) {
                    intent2 = akfg.g(emwi.MISSING_BACKUP_ACCOUNT_NOTIFICATION);
                } else {
                    intent2 = new Intent();
                    intent2.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
                    dymf.c(intent2, emwi.MISSING_BACKUP_ACCOUNT_NOTIFICATION);
                }
                fodi fodiVar = fodi.a;
                fodiVar.lK().q();
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, (true != fodiVar.lK().p() ? 0 : 67108864) | 134217728);
                boolean a2 = fobtVar.lK().a();
                if (fodiVar.lK().o()) {
                    builder = aker.b(this);
                } else {
                    builder = new Notification.Builder(this);
                    aker.f(this, builder, "com.google.android.gms.backup.notification.channel.id");
                }
                builder.setPriority(1).setWhen(System.currentTimeMillis()).setContentTitle(getString(R.string.notification_content_title_set_backup_account)).setContentText(getString(R.string.notification_content_text_set_backup_account)).setContentIntent(activity).setOngoing(a2);
                if (fodi.e()) {
                    aker.d(getApplicationContext(), builder);
                } else {
                    builder.setSmallIcon(android.R.drawable.stat_sys_warning);
                }
                this.d.w("com.google.android.backup.notification.account.tag", 1, dhpk.BACKUP_SET_ACCOUNT_NOTIFICATION_ID, builder.build());
                b(2);
                if (!this.e.edit().putBoolean("notified", true).commit()) {
                    ajwtVar.m("Failed to write notification preference", new Object[0]);
                }
                if (fodi.d()) {
                    if (!this.e.edit().putInt("notified_count", i + 1).commit()) {
                        ajwtVar.m("Failed to write notification preference", new Object[0]);
                    }
                    if (this.e.edit().putLong("notified_timestamp", currentTimeMillis).commit()) {
                        return;
                    }
                    ajwtVar.m("Failed to write notification preference", new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        a();
    }
}
