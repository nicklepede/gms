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
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.ahws;
import defpackage.ajko;
import defpackage.ajkq;
import defpackage.ajrb;
import defpackage.arxo;
import defpackage.asqh;
import defpackage.dfae;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edgl;
import defpackage.edig;
import defpackage.edjt;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ennt;
import defpackage.esiu;
import defpackage.esiw;
import defpackage.eswh;
import defpackage.eswj;
import defpackage.eswm;
import defpackage.eswt;
import defpackage.eswu;
import defpackage.eswz;
import defpackage.esxa;
import defpackage.esxo;
import defpackage.esxp;
import defpackage.esyj;
import defpackage.esyk;
import defpackage.esyo;
import defpackage.esyq;
import defpackage.esyr;
import defpackage.esys;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fhnc;
import defpackage.juc;
import defpackage.qfp;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupOptInChimeraActivity extends qfp {
    public static final arxo j = ahwd.a("BackupOptInChimeraActivity");
    public Account k;
    public boolean l;
    public boolean m;
    private BroadcastReceiver o;
    private final eijr n = eijy.a(new eijr() { // from class: ajki
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fllt.a.a().N());
        }
    });
    private final ahpw p = ahpw.a;

    public static eswh a(Integer num, List list, Integer num2, Integer num3) {
        fecj v = eswh.a.v();
        if (num != null) {
            eswt eswtVar = (eswt) eswu.a.v();
            num.intValue();
            eswtVar.k(R.string.backup_opt_in_backup_disable_confirmation_title);
            if (!v.b.L()) {
                v.U();
            }
            eswh eswhVar = (eswh) v.b;
            eswu eswuVar = (eswu) eswtVar.Q();
            eswuVar.getClass();
            eswhVar.d = eswuVar;
            eswhVar.b |= 2;
        }
        if (list != null) {
            eswt eswtVar2 = (eswt) eswu.a.v();
            eswtVar2.a(list);
            if (!v.b.L()) {
                v.U();
            }
            eswh eswhVar2 = (eswh) v.b;
            eswu eswuVar2 = (eswu) eswtVar2.Q();
            eswuVar2.getClass();
            eswhVar2.e = eswuVar2;
            eswhVar2.b |= 4;
        }
        if (num2 != null) {
            eswt eswtVar3 = (eswt) eswu.a.v();
            num2.intValue();
            eswtVar3.k(R.string.common_ok);
            if (!v.b.L()) {
                v.U();
            }
            eswh eswhVar3 = (eswh) v.b;
            eswu eswuVar3 = (eswu) eswtVar3.Q();
            eswuVar3.getClass();
            eswhVar3.f = eswuVar3;
            eswhVar3.b |= 8;
        }
        eswt eswtVar4 = (eswt) eswu.a.v();
        eswtVar4.k(num3.intValue());
        if (!v.b.L()) {
            v.U();
        }
        eswh eswhVar4 = (eswh) v.b;
        eswu eswuVar4 = (eswu) eswtVar4.Q();
        eswuVar4.getClass();
        eswhVar4.g = eswuVar4;
        eswhVar4.b |= 16;
        return (eswh) v.Q();
    }

    public static void b(BackupOptInChimeraActivity backupOptInChimeraActivity, Account account, boolean z) {
        eswz eswzVar = (eswz) esxa.a.v();
        fecj v = esxo.a.v();
        esiw esiwVar = esiw.ANDROID_BACKUP_SETTING_CHANGE;
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar = (esxo) v.b;
        esxoVar.c = esiwVar.lF;
        esxoVar.b |= 1;
        fecj v2 = esxp.a.v();
        eswm g = g();
        fecj fecjVar = (fecj) g.iB(5, null);
        fecjVar.X(g);
        fecj v3 = esyr.a.v();
        esyq esyqVar = z ? esyq.ENABLED : esyq.DISABLED;
        if (!v3.b.L()) {
            v3.U();
        }
        esyr esyrVar = (esyr) v3.b;
        esyrVar.c = esyqVar.d;
        esyrVar.b |= 1;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        eswm eswmVar = (eswm) fecjVar.b;
        esyr esyrVar2 = (esyr) v3.Q();
        eswm eswmVar2 = eswm.a;
        esyrVar2.getClass();
        eswmVar.c = esyrVar2;
        eswmVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar = (esxp) v2.b;
        eswm eswmVar3 = (eswm) fecjVar.Q();
        eswmVar3.getClass();
        esxpVar.h = eswmVar3;
        esxpVar.b |= 8;
        esyj esyjVar = (esyj) esyk.a.v();
        esyjVar.a(true != z ? 11 : 10);
        esyk esykVar = (esyk) esyjVar.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar2 = (esxp) v2.b;
        esykVar.getClass();
        esxpVar2.t = esykVar;
        esxpVar2.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar2 = (esxo) v.b;
        esxp esxpVar3 = (esxp) v2.Q();
        esxpVar3.getClass();
        esxoVar2.d = esxpVar3;
        esxoVar2.b |= 2;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar = (esxa) eswzVar.b;
        esxo esxoVar3 = (esxo) v.Q();
        esxoVar3.getClass();
        esxaVar.f = esxoVar3;
        esxaVar.b |= 4;
        fecj v4 = esys.a.v();
        esiu esiuVar = esiu.P;
        if (!v4.b.L()) {
            v4.U();
        }
        esys esysVar = (esys) v4.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        eswj f = f();
        fecj fecjVar2 = (fecj) f.iB(5, null);
        fecjVar2.X(f);
        eswh x = ajkq.x();
        fecj fecjVar3 = (fecj) x.iB(5, null);
        fecjVar3.X(x);
        boolean z2 = backupOptInChimeraActivity.m;
        if (!fecjVar3.b.L()) {
            fecjVar3.U();
        }
        eswh eswhVar = (eswh) fecjVar3.b;
        eswh eswhVar2 = eswh.a;
        eswhVar.b |= 1;
        eswhVar.c = z2;
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        eswj eswjVar = (eswj) fecjVar2.b;
        eswh eswhVar3 = (eswh) fecjVar3.Q();
        eswj eswjVar2 = eswj.a;
        eswhVar3.getClass();
        eswjVar.h = eswhVar3;
        eswjVar.b |= 32;
        eswh x2 = ajko.x();
        fecj fecjVar4 = (fecj) x2.iB(5, null);
        fecjVar4.X(x2);
        boolean z3 = backupOptInChimeraActivity.l;
        if (!fecjVar4.b.L()) {
            fecjVar4.U();
        }
        eswh eswhVar4 = (eswh) fecjVar4.b;
        eswhVar4.b = 1 | eswhVar4.b;
        eswhVar4.c = z3;
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        eswj eswjVar3 = (eswj) fecjVar2.b;
        eswh eswhVar5 = (eswh) fecjVar4.Q();
        eswhVar5.getClass();
        eswjVar3.g = eswhVar5;
        eswjVar3.b |= 16;
        eswj eswjVar4 = (eswj) fecjVar2.Q();
        fecj v5 = esyo.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        esyo esyoVar = (esyo) v5.b;
        eswjVar4.getClass();
        esyoVar.f = eswjVar4;
        esyoVar.b |= 4;
        if (!v4.b.L()) {
            v4.U();
        }
        esys esysVar2 = (esys) v4.b;
        esyo esyoVar2 = (esyo) v5.Q();
        esyoVar2.getClass();
        esysVar2.d = esyoVar2;
        esysVar2.b |= 8;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar2 = (esxa) eswzVar.b;
        esys esysVar3 = (esys) v4.Q();
        esysVar3.getClass();
        esxaVar2.g = esysVar3;
        esxaVar2.b |= 8;
        ahws.c(backupOptInChimeraActivity, eswzVar, account).x(new dfae() { // from class: ajkj
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                arxo arxoVar = BackupOptInChimeraActivity.j;
                if (dfaqVar.m()) {
                    return;
                }
                BackupOptInChimeraActivity.j.g("Exception writing audit record", dfaqVar.h(), new Object[0]);
            }
        });
    }

    public static void c(Context context, boolean z) {
        ajrb ajrbVar = new ajrb(context);
        fecj fecjVar = ajrbVar.g;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fhnc fhncVar = (fhnc) fecjVar.b;
        fhnc fhncVar2 = fhnc.a;
        fhncVar.b |= 1;
        fhncVar.c = z;
        ajrbVar.f();
    }

    private static eswj f() {
        int[] iArr = {R.string.backup_opt_in_backup_description_v2, R.string.drive_backup_disabled_backuplist, R.string.drive_backup_disabled_detailedinfo};
        fecj v = eswj.a.v();
        eswt eswtVar = (eswt) eswu.a.v();
        eswtVar.k(R.string.backup_data_title_no_drive_branding);
        if (!v.b.L()) {
            v.U();
        }
        eswj eswjVar = (eswj) v.b;
        eswu eswuVar = (eswu) eswtVar.Q();
        eswuVar.getClass();
        eswjVar.c = eswuVar;
        eswjVar.b |= 1;
        eswu eswuVar2 = eswu.a;
        eswt eswtVar2 = (eswt) eswuVar2.v();
        eswtVar2.a(ennt.j(iArr));
        if (!v.b.L()) {
            v.U();
        }
        eswj eswjVar2 = (eswj) v.b;
        eswu eswuVar3 = (eswu) eswtVar2.Q();
        eswuVar3.getClass();
        eswjVar2.d = eswuVar3;
        eswjVar2.b |= 2;
        eswt eswtVar3 = (eswt) eswuVar2.v();
        eswtVar3.k(R.string.common_ok);
        if (!v.b.L()) {
            v.U();
        }
        eswj eswjVar3 = (eswj) v.b;
        eswu eswuVar4 = (eswu) eswtVar3.Q();
        eswuVar4.getClass();
        eswjVar3.e = eswuVar4;
        eswjVar3.b |= 4;
        eswt eswtVar4 = (eswt) eswuVar2.v();
        eswtVar4.k(R.string.backup_opt_in_disable_backup);
        if (!v.b.L()) {
            v.U();
        }
        eswj eswjVar4 = (eswj) v.b;
        eswu eswuVar5 = (eswu) eswtVar4.Q();
        eswuVar5.getClass();
        eswjVar4.f = eswuVar5;
        eswjVar4.b |= 8;
        return (eswj) v.Q();
    }

    private static eswm g() {
        fecj v = eswm.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        eswm eswmVar = (eswm) fecpVar;
        eswmVar.b |= 2;
        eswmVar.d = true;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        eswm eswmVar2 = (eswm) fecpVar2;
        eswmVar2.b |= 4;
        eswmVar2.e = true;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        eswm eswmVar3 = (eswm) fecpVar3;
        eswmVar3.b |= 8;
        eswmVar3.f = true;
        if (!fecpVar3.L()) {
            v.U();
        }
        eswm eswmVar4 = (eswm) v.b;
        eswmVar4.b |= 16;
        eswmVar4.g = true;
        return (eswm) v.Q();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (((Boolean) this.n.a()).booleanValue()) {
            super.onCreate(bundle);
            setResult(1);
            finish();
            return;
        }
        edjt d = edjt.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new edjt(R.style.SudThemeGlif_Light, false).a(getIntent()));
        super.onCreate(bundle);
        setContentView(R.layout.activity_target_opt_in);
        if (!edgl.c(getIntent()) || asqh.e()) {
            setResult(1);
            finish();
            return;
        }
        if (bundle != null) {
            this.l = bundle.getBoolean("confirm-disable-back-dialog-shown");
            this.m = bundle.getBoolean("learn-more-dialog-shown");
        }
        eswj f = f();
        eswu eswuVar = f.c;
        if (eswuVar == null) {
            eswuVar = eswu.a;
        }
        int d2 = eswuVar.b.d(0);
        setTitle(d2);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.backup_opt_in);
        glifLayout.H(d2);
        Drawable drawable = getDrawable(R.drawable.quantum_gm_ic_backup_vd_theme_24);
        edig edigVar = (edig) glifLayout.q(edig.class);
        edigVar.d(getColor(R.color.sud_color_accent_glif_light));
        edigVar.e(true);
        edigVar.c(drawable);
        ahpw ahpwVar = this.p;
        eswm g = g();
        ahpwVar.d(this, g.d);
        ahpwVar.g(this, g.e);
        ahpwVar.b(this, g.f);
        if (g.g) {
            Settings.Secure.putInt(getContentResolver(), "has_enabled_photos_backup_before", 1);
        }
        TextView textView = (TextView) findViewById(R.id.backup_opt_in_description);
        eswu eswuVar2 = f.d;
        if (eswuVar2 == null) {
            eswuVar2 = eswu.a;
        }
        textView.setText(eswuVar2.b.d(0));
        LinkSpan.a(textView, "backup_opt_in_learn_more");
        TextView textView2 = (TextView) findViewById(R.id.backup_opt_in_description_list);
        eswu eswuVar3 = f.d;
        if (eswuVar3 == null) {
            eswuVar3 = eswu.a;
        }
        textView2.setText(eswuVar3.b.d(1));
        TextView textView3 = (TextView) findViewById(R.id.backup_opt_in_backup_description_extra);
        eswu eswuVar4 = f.d;
        if (eswuVar4 == null) {
            eswuVar4 = eswu.a;
        }
        textView3.setText(eswuVar4.b.d(2));
        edfq edfqVar = (edfq) glifLayout.q(edfq.class);
        edfr edfrVar = new edfr(this);
        edfrVar.c = 6;
        edfrVar.d = R.style.SudGlifButton_Primary;
        eswu eswuVar5 = f.e;
        if (eswuVar5 == null) {
            eswuVar5 = eswu.a;
        }
        edfrVar.b(eswuVar5.b.d(0));
        edfrVar.b = new View.OnClickListener() { // from class: ajkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                backupOptInChimeraActivity.k = (Account) backupOptInChimeraActivity.getIntent().getParcelableExtra("account");
                BackupOptInChimeraActivity.b(backupOptInChimeraActivity, backupOptInChimeraActivity.k, true);
                BackupOptInChimeraActivity.c(backupOptInChimeraActivity, true);
                new ahpv(backupOptInChimeraActivity).g(true);
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
        edfqVar.b(edfrVar.a());
        edfr edfrVar2 = new edfr(this);
        edfrVar2.c = 7;
        edfrVar2.d = R.style.SudGlifButton_Secondary;
        eswu eswuVar6 = f.f;
        if (eswuVar6 == null) {
            eswuVar6 = eswu.a;
        }
        edfrVar2.b(eswuVar6.b.d(0));
        edfrVar2.b = new View.OnClickListener() { // from class: ajkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajko ajkoVar = new ajko();
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                ajkoVar.ag = backupOptInChimeraActivity;
                ajkoVar.show(backupOptInChimeraActivity.getSupportFragmentManager(), "dialog");
            }
        };
        edfqVar.c(edfrVar2.a());
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        if (((Boolean) this.n.a()).booleanValue()) {
            return;
        }
        juc.a(this).d(this.o);
        this.o = null;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (((Boolean) this.n.a()).booleanValue()) {
            return;
        }
        this.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                if (extras == null || !"backup_opt_in_learn_more".equals(extras.getString("id"))) {
                    return;
                }
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                ajkq ajkqVar = new ajkq();
                ajkqVar.ag = backupOptInChimeraActivity;
                ajkqVar.show(backupOptInChimeraActivity.getSupportFragmentManager(), "dialog");
            }
        };
        juc.a(this).c(this.o, new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED"));
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        if (((Boolean) this.n.a()).booleanValue()) {
            super.onSaveInstanceState(bundle);
            return;
        }
        bundle.putBoolean("confirm-disable-back-dialog-shown", this.l);
        bundle.putBoolean("learn-more-dialog-shown", this.m);
        super.onSaveInstanceState(bundle);
    }
}
