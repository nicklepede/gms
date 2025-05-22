package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.component.BackupAccountApiHelperIntentOperation;
import com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity;
import com.google.android.gms.backup.settings.component.PhotosBackupApiHelperIntentOperation;
import com.google.android.gms.common.ui.LinkSpan;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.setupdesign.GlifLayout;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.ajxi;
import defpackage.allg;
import defpackage.alli;
import defpackage.alru;
import defpackage.auad;
import defpackage.auub;
import defpackage.dhlk;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.eftg;
import defpackage.efvb;
import defpackage.efwo;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqbm;
import defpackage.euyj;
import defpackage.euyl;
import defpackage.evlx;
import defpackage.evlz;
import defpackage.evmc;
import defpackage.evmj;
import defpackage.evmk;
import defpackage.evmp;
import defpackage.evmq;
import defpackage.evne;
import defpackage.evnf;
import defpackage.evnz;
import defpackage.evoa;
import defpackage.evoe;
import defpackage.evog;
import defpackage.evoh;
import defpackage.evoi;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fkcz;
import defpackage.kar;
import defpackage.ryt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupOptInChimeraActivity extends ryt {
    public static final auad j = ajwt.a("BackupOptInChimeraActivity");
    public Account k;
    public boolean l;
    public boolean m;
    private BroadcastReceiver o;
    private final ekww n = ekxd.a(new ekww() { // from class: alla
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodd.a.lK().N());
        }
    });
    private final ajqm p = ajqm.a;

    public static evlx a(Integer num, List list, Integer num2, Integer num3) {
        fgrc v = evlx.a.v();
        if (num != null) {
            evmj evmjVar = (evmj) evmk.a.v();
            num.intValue();
            evmjVar.k(R.string.backup_opt_in_backup_disable_confirmation_title);
            if (!v.b.L()) {
                v.U();
            }
            evlx evlxVar = (evlx) v.b;
            evmk evmkVar = (evmk) evmjVar.Q();
            evmkVar.getClass();
            evlxVar.d = evmkVar;
            evlxVar.b |= 2;
        }
        if (list != null) {
            evmj evmjVar2 = (evmj) evmk.a.v();
            evmjVar2.a(list);
            if (!v.b.L()) {
                v.U();
            }
            evlx evlxVar2 = (evlx) v.b;
            evmk evmkVar2 = (evmk) evmjVar2.Q();
            evmkVar2.getClass();
            evlxVar2.e = evmkVar2;
            evlxVar2.b |= 4;
        }
        if (num2 != null) {
            evmj evmjVar3 = (evmj) evmk.a.v();
            num2.intValue();
            evmjVar3.k(R.string.common_ok);
            if (!v.b.L()) {
                v.U();
            }
            evlx evlxVar3 = (evlx) v.b;
            evmk evmkVar3 = (evmk) evmjVar3.Q();
            evmkVar3.getClass();
            evlxVar3.f = evmkVar3;
            evlxVar3.b |= 8;
        }
        evmj evmjVar4 = (evmj) evmk.a.v();
        evmjVar4.k(num3.intValue());
        if (!v.b.L()) {
            v.U();
        }
        evlx evlxVar4 = (evlx) v.b;
        evmk evmkVar4 = (evmk) evmjVar4.Q();
        evmkVar4.getClass();
        evlxVar4.g = evmkVar4;
        evlxVar4.b |= 16;
        return (evlx) v.Q();
    }

    public static void b(BackupOptInChimeraActivity backupOptInChimeraActivity, Account account, boolean z) {
        evmp evmpVar = (evmp) evmq.a.v();
        fgrc v = evne.a.v();
        euyl euylVar = euyl.ANDROID_BACKUP_SETTING_CHANGE;
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar = (evne) v.b;
        evneVar.c = euylVar.lK;
        evneVar.b |= 1;
        fgrc v2 = evnf.a.v();
        evmc g = g();
        fgrc fgrcVar = (fgrc) g.iQ(5, null);
        fgrcVar.X(g);
        fgrc v3 = evoh.a.v();
        evog evogVar = z ? evog.ENABLED : evog.DISABLED;
        if (!v3.b.L()) {
            v3.U();
        }
        evoh evohVar = (evoh) v3.b;
        evohVar.c = evogVar.d;
        evohVar.b |= 1;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        evmc evmcVar = (evmc) fgrcVar.b;
        evoh evohVar2 = (evoh) v3.Q();
        evmc evmcVar2 = evmc.a;
        evohVar2.getClass();
        evmcVar.c = evohVar2;
        evmcVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar = (evnf) v2.b;
        evmc evmcVar3 = (evmc) fgrcVar.Q();
        evmcVar3.getClass();
        evnfVar.h = evmcVar3;
        evnfVar.b |= 8;
        evnz evnzVar = (evnz) evoa.a.v();
        evnzVar.a(true != z ? 11 : 10);
        evoa evoaVar = (evoa) evnzVar.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar2 = (evnf) v2.b;
        evoaVar.getClass();
        evnfVar2.t = evoaVar;
        evnfVar2.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar2 = (evne) v.b;
        evnf evnfVar3 = (evnf) v2.Q();
        evnfVar3.getClass();
        evneVar2.d = evnfVar3;
        evneVar2.b |= 2;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar = (evmq) evmpVar.b;
        evne evneVar3 = (evne) v.Q();
        evneVar3.getClass();
        evmqVar.f = evneVar3;
        evmqVar.b |= 4;
        fgrc v4 = evoi.a.v();
        euyj euyjVar = euyj.P;
        if (!v4.b.L()) {
            v4.U();
        }
        evoi evoiVar = (evoi) v4.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        evlz f = f();
        fgrc fgrcVar2 = (fgrc) f.iQ(5, null);
        fgrcVar2.X(f);
        evlx x = alli.x();
        fgrc fgrcVar3 = (fgrc) x.iQ(5, null);
        fgrcVar3.X(x);
        boolean z2 = backupOptInChimeraActivity.m;
        if (!fgrcVar3.b.L()) {
            fgrcVar3.U();
        }
        evlx evlxVar = (evlx) fgrcVar3.b;
        evlx evlxVar2 = evlx.a;
        evlxVar.b |= 1;
        evlxVar.c = z2;
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        evlz evlzVar = (evlz) fgrcVar2.b;
        evlx evlxVar3 = (evlx) fgrcVar3.Q();
        evlz evlzVar2 = evlz.a;
        evlxVar3.getClass();
        evlzVar.h = evlxVar3;
        evlzVar.b |= 32;
        evlx x2 = allg.x();
        fgrc fgrcVar4 = (fgrc) x2.iQ(5, null);
        fgrcVar4.X(x2);
        boolean z3 = backupOptInChimeraActivity.l;
        if (!fgrcVar4.b.L()) {
            fgrcVar4.U();
        }
        evlx evlxVar4 = (evlx) fgrcVar4.b;
        evlxVar4.b = 1 | evlxVar4.b;
        evlxVar4.c = z3;
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        evlz evlzVar3 = (evlz) fgrcVar2.b;
        evlx evlxVar5 = (evlx) fgrcVar4.Q();
        evlxVar5.getClass();
        evlzVar3.g = evlxVar5;
        evlzVar3.b |= 16;
        evlz evlzVar4 = (evlz) fgrcVar2.Q();
        fgrc v5 = evoe.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        evoe evoeVar = (evoe) v5.b;
        evlzVar4.getClass();
        evoeVar.f = evlzVar4;
        evoeVar.b |= 4;
        if (!v4.b.L()) {
            v4.U();
        }
        evoi evoiVar2 = (evoi) v4.b;
        evoe evoeVar2 = (evoe) v5.Q();
        evoeVar2.getClass();
        evoiVar2.d = evoeVar2;
        evoiVar2.b |= 8;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar2 = (evmq) evmpVar.b;
        evoi evoiVar3 = (evoi) v4.Q();
        evoiVar3.getClass();
        evmqVar2.g = evoiVar3;
        evmqVar2.b |= 8;
        ajxi.c(backupOptInChimeraActivity, evmpVar, account).x(new dhlk() { // from class: allb
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                auad auadVar = BackupOptInChimeraActivity.j;
                if (dhlwVar.m()) {
                    return;
                }
                BackupOptInChimeraActivity.j.g("Exception writing audit record", dhlwVar.h(), new Object[0]);
            }
        });
    }

    public static void c(Context context, boolean z) {
        alru alruVar = new alru(context);
        fgrc fgrcVar = alruVar.g;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fkcz fkczVar = (fkcz) fgrcVar.b;
        fkcz fkczVar2 = fkcz.a;
        fkczVar.b |= 1;
        fkczVar.c = z;
        alruVar.f();
    }

    private static evlz f() {
        int[] iArr = {R.string.backup_opt_in_backup_description_v2, R.string.drive_backup_disabled_backuplist, R.string.drive_backup_disabled_detailedinfo};
        fgrc v = evlz.a.v();
        evmk evmkVar = evmk.a;
        evmj evmjVar = (evmj) evmkVar.v();
        evmjVar.k(R.string.backup_data_title_no_drive_branding);
        if (!v.b.L()) {
            v.U();
        }
        evlz evlzVar = (evlz) v.b;
        evmk evmkVar2 = (evmk) evmjVar.Q();
        evmkVar2.getClass();
        evlzVar.c = evmkVar2;
        evlzVar.b |= 1;
        evmj evmjVar2 = (evmj) evmkVar.v();
        evmjVar2.a(eqbm.j(iArr));
        if (!v.b.L()) {
            v.U();
        }
        evlz evlzVar2 = (evlz) v.b;
        evmk evmkVar3 = (evmk) evmjVar2.Q();
        evmkVar3.getClass();
        evlzVar2.d = evmkVar3;
        evlzVar2.b |= 2;
        evmj evmjVar3 = (evmj) evmkVar.v();
        evmjVar3.k(R.string.common_ok);
        if (!v.b.L()) {
            v.U();
        }
        evlz evlzVar3 = (evlz) v.b;
        evmk evmkVar4 = (evmk) evmjVar3.Q();
        evmkVar4.getClass();
        evlzVar3.e = evmkVar4;
        evlzVar3.b |= 4;
        evmj evmjVar4 = (evmj) evmkVar.v();
        evmjVar4.k(R.string.backup_opt_in_disable_backup);
        if (!v.b.L()) {
            v.U();
        }
        evlz evlzVar4 = (evlz) v.b;
        evmk evmkVar5 = (evmk) evmjVar4.Q();
        evmkVar5.getClass();
        evlzVar4.f = evmkVar5;
        evlzVar4.b |= 8;
        return (evlz) v.Q();
    }

    private static evmc g() {
        fgrc v = evmc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        evmc evmcVar = (evmc) fgriVar;
        evmcVar.b |= 2;
        evmcVar.d = true;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        evmc evmcVar2 = (evmc) fgriVar2;
        evmcVar2.b |= 4;
        evmcVar2.e = true;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        evmc evmcVar3 = (evmc) fgriVar3;
        evmcVar3.b |= 8;
        evmcVar3.f = true;
        if (!fgriVar3.L()) {
            v.U();
        }
        evmc evmcVar4 = (evmc) v.b;
        evmcVar4.b |= 16;
        evmcVar4.g = true;
        return (evmc) v.Q();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (((Boolean) this.n.lK()).booleanValue()) {
            super.onCreate(bundle);
            setResult(1);
            finish();
            return;
        }
        efwo d = efwo.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new efwo(R.style.SudThemeGlif_Light, false).a(getIntent()));
        super.onCreate(bundle);
        setContentView(R.layout.activity_target_opt_in);
        if (!eftg.c(getIntent()) || auub.e()) {
            setResult(1);
            finish();
            return;
        }
        if (bundle != null) {
            this.l = bundle.getBoolean("confirm-disable-back-dialog-shown");
            this.m = bundle.getBoolean("learn-more-dialog-shown");
        }
        evlz f = f();
        evmk evmkVar = f.c;
        if (evmkVar == null) {
            evmkVar = evmk.a;
        }
        int d2 = evmkVar.b.d(0);
        setTitle(d2);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.backup_opt_in);
        glifLayout.H(d2);
        Drawable drawable = getDrawable(R.drawable.quantum_gm_ic_backup_vd_theme_24);
        efvb efvbVar = (efvb) glifLayout.q(efvb.class);
        efvbVar.d(getColor(R.color.sud_color_accent_glif_light));
        efvbVar.e(true);
        efvbVar.c(drawable);
        ajqm ajqmVar = this.p;
        evmc g = g();
        ajqmVar.d(this, g.d);
        ajqmVar.g(this, g.e);
        ajqmVar.b(this, g.f);
        if (g.g) {
            Settings.Secure.putInt(getContentResolver(), "has_enabled_photos_backup_before", 1);
        }
        TextView textView = (TextView) findViewById(R.id.backup_opt_in_description);
        evmk evmkVar2 = f.d;
        if (evmkVar2 == null) {
            evmkVar2 = evmk.a;
        }
        textView.setText(evmkVar2.b.d(0));
        LinkSpan.a(textView, "backup_opt_in_learn_more");
        TextView textView2 = (TextView) findViewById(R.id.backup_opt_in_description_list);
        evmk evmkVar3 = f.d;
        if (evmkVar3 == null) {
            evmkVar3 = evmk.a;
        }
        textView2.setText(evmkVar3.b.d(1));
        TextView textView3 = (TextView) findViewById(R.id.backup_opt_in_backup_description_extra);
        evmk evmkVar4 = f.d;
        if (evmkVar4 == null) {
            evmkVar4 = evmk.a;
        }
        textView3.setText(evmkVar4.b.d(2));
        efsl efslVar = (efsl) glifLayout.q(efsl.class);
        efsm efsmVar = new efsm(this);
        efsmVar.c = 6;
        efsmVar.d = R.style.SudGlifButton_Primary;
        evmk evmkVar5 = f.e;
        if (evmkVar5 == null) {
            evmkVar5 = evmk.a;
        }
        efsmVar.b(evmkVar5.b.d(0));
        efsmVar.b = new View.OnClickListener() { // from class: allc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                backupOptInChimeraActivity.k = (Account) backupOptInChimeraActivity.getIntent().getParcelableExtra("account");
                BackupOptInChimeraActivity.b(backupOptInChimeraActivity, backupOptInChimeraActivity.k, true);
                BackupOptInChimeraActivity.c(backupOptInChimeraActivity, true);
                new ajql(backupOptInChimeraActivity).f(true);
                backupOptInChimeraActivity.startService(PhotosBackupApiHelperIntentOperation.b(backupOptInChimeraActivity, backupOptInChimeraActivity.k.name, true));
                Account account = backupOptInChimeraActivity.k;
                int i2 = BackupAccountApiHelperIntentOperation.a;
                Intent intent = new Intent();
                intent.setClassName(backupOptInChimeraActivity, "com.google.android.gms.chimera.GmsIntentOperationService").setAction("com.google.android.gms.backup.CONNECT_TO_BACKUP_ACCOUNT_API").putExtra("account", account);
                backupOptInChimeraActivity.startService(intent);
                backupOptInChimeraActivity.setResult(-1);
                backupOptInChimeraActivity.finish();
            }
        };
        efslVar.b(efsmVar.a());
        efsm efsmVar2 = new efsm(this);
        efsmVar2.c = 7;
        efsmVar2.d = R.style.SudGlifButton_Secondary;
        evmk evmkVar6 = f.f;
        if (evmkVar6 == null) {
            evmkVar6 = evmk.a;
        }
        efsmVar2.b(evmkVar6.b.d(0));
        efsmVar2.b = new View.OnClickListener() { // from class: alld
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                allg allgVar = new allg();
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                allgVar.ag = backupOptInChimeraActivity;
                allgVar.show(backupOptInChimeraActivity.getSupportFragmentManager(), "dialog");
            }
        };
        efslVar.c(efsmVar2.a());
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        if (((Boolean) this.n.lK()).booleanValue()) {
            return;
        }
        kar.a(this).d(this.o);
        this.o = null;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (((Boolean) this.n.lK()).booleanValue()) {
            return;
        }
        this.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                if (extras == null || !"backup_opt_in_learn_more".equals(extras.getString("id"))) {
                    return;
                }
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                alli alliVar = new alli();
                alliVar.ag = backupOptInChimeraActivity;
                alliVar.show(backupOptInChimeraActivity.getSupportFragmentManager(), "dialog");
            }
        };
        kar.a(this).c(this.o, new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED"));
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        if (((Boolean) this.n.lK()).booleanValue()) {
            super.onSaveInstanceState(bundle);
            return;
        }
        bundle.putBoolean("confirm-disable-back-dialog-shown", this.l);
        bundle.putBoolean("learn-more-dialog-shown", this.m);
        super.onSaveInstanceState(bundle);
    }
}
