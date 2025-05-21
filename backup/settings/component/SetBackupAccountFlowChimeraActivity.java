package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ahhp;
import defpackage.ahpv;
import defpackage.ahrf;
import defpackage.ahrj;
import defpackage.ahwd;
import defpackage.ahws;
import defpackage.aidc;
import defpackage.ajks;
import defpackage.ajmt;
import defpackage.ajmw;
import defpackage.ajmx;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.dfae;
import defpackage.edeq;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edfs;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.ennt;
import defpackage.ensv;
import defpackage.esiu;
import defpackage.esiw;
import defpackage.eswh;
import defpackage.eswm;
import defpackage.esws;
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
import defpackage.flom;
import defpackage.flpk;
import defpackage.qfp;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetBackupAccountFlowChimeraActivity extends qfp implements ajmw {
    public static final arxo j = ahwd.a("SetBackupAccountFlow");
    private eswh A;
    private fecj B;
    public GlifLayout k;
    public TextView l;
    public TextView m;
    public edfs n;
    public edfs o;
    public ahhp p;
    public Account q;
    public eswm r;
    public Account s;
    private final ensv t = new asmf(1, 9);
    private TextView u;
    private Button v;
    private AsyncTask w;
    private ahpv x;
    private List y;
    private eswu z;

    private final void k() {
        setTitle(R.string.backup_turned_off_title);
        this.k.H(R.string.backup_turned_off_title);
        this.l.setGravity(17);
        this.l.setText(R.string.backup_turned_off_description);
        this.m.setVisibility(8);
        this.n.d(getString(android.R.string.ok));
        this.n.f = new View.OnClickListener() { // from class: ajmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity.this.finishAndRemoveTask();
            }
        };
        this.o.f(4);
        this.u.setVisibility(4);
        this.v.setVisibility(4);
    }

    private final void l() {
        List a = aidc.a(this);
        this.y = a;
        if (a.isEmpty()) {
            j.j("No accounts for backup on device, launching add account", new Object[0]);
            b();
            finishAndRemoveTask();
            return;
        }
        if (!ahrf.a()) {
            ajmt ajmtVar = new ajmt(this);
            this.w = ajmtVar;
            ajmtVar.executeOnExecutor(this.t, new Void[0]);
            return;
        }
        if (getIntent().getParcelableExtra("account") == null) {
            j.d("No account extra. Getting first account.", new Object[0]);
            this.s = (Account) this.y.get(0);
            getIntent().putExtra("account", this.s);
        } else {
            this.s = (Account) getIntent().getParcelableExtra("account");
        }
        this.u.setVisibility(0);
        this.u.setText(this.s.name);
        setTitle(R.string.backup_data_title_no_drive_branding);
        this.k.H(R.string.backup_data_title_no_drive_branding);
        this.n.d(getString(R.string.common_ok));
        this.n.f = new View.OnClickListener() { // from class: ajmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity = SetBackupAccountFlowChimeraActivity.this;
                Account account = setBackupAccountFlowChimeraActivity.s;
                eswz eswzVar = (eswz) esxa.a.v();
                fecj v = esxo.a.v();
                esiw esiwVar = esiw.ANDROID_BACKUP_SET_ACCOUNT;
                if (!v.b.L()) {
                    v.U();
                }
                esxo esxoVar = (esxo) v.b;
                esxoVar.c = esiwVar.lF;
                esxoVar.b |= 1;
                fecj v2 = esxp.a.v();
                eswm eswmVar = setBackupAccountFlowChimeraActivity.r;
                fecj fecjVar = (fecj) eswmVar.iB(5, null);
                fecjVar.X(eswmVar);
                fecj v3 = esyr.a.v();
                esyq esyqVar = esyq.ENABLED;
                if (!v3.b.L()) {
                    v3.U();
                }
                esyr esyrVar = (esyr) v3.b;
                esyrVar.c = esyqVar.d;
                esyrVar.b |= 1;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                eswm eswmVar2 = (eswm) fecjVar.b;
                esyr esyrVar2 = (esyr) v3.Q();
                eswm eswmVar3 = eswm.a;
                esyrVar2.getClass();
                eswmVar2.c = esyrVar2;
                eswmVar2.b |= 1;
                boolean c = ajks.c(setBackupAccountFlowChimeraActivity);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                eswm eswmVar4 = (eswm) fecjVar.b;
                eswmVar4.b |= 16;
                eswmVar4.g = c;
                setBackupAccountFlowChimeraActivity.r = (eswm) fecjVar.Q();
                eswm eswmVar5 = setBackupAccountFlowChimeraActivity.r;
                if (!v2.b.L()) {
                    v2.U();
                }
                esxp esxpVar = (esxp) v2.b;
                eswmVar5.getClass();
                esxpVar.h = eswmVar5;
                esxpVar.b |= 8;
                esyj esyjVar = (esyj) esyk.a.v();
                esyjVar.a(12);
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
                esiu esiuVar = esiu.X;
                if (!v4.b.L()) {
                    v4.U();
                }
                esys esysVar = (esys) v4.b;
                esysVar.c = esiuVar.a();
                esysVar.b |= 1;
                fecj v5 = esyo.a.v();
                esws a2 = setBackupAccountFlowChimeraActivity.a();
                if (!v5.b.L()) {
                    v5.U();
                }
                esyo esyoVar = (esyo) v5.b;
                a2.getClass();
                esyoVar.h = a2;
                esyoVar.b |= 128;
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
                ahws.c(setBackupAccountFlowChimeraActivity.getApplicationContext(), eswzVar, account).x(new dfae() { // from class: ajmk
                    @Override // defpackage.dfae
                    public final void hr(dfaq dfaqVar) {
                        arxo arxoVar = SetBackupAccountFlowChimeraActivity.j;
                        if (dfaqVar.m()) {
                            return;
                        }
                        SetBackupAccountFlowChimeraActivity.j.g("Exception writing audit record", dfaqVar.h(), new Object[0]);
                    }
                });
                eswm eswmVar6 = setBackupAccountFlowChimeraActivity.r;
                ahpw ahpwVar = ahpw.a;
                ahpwVar.d(setBackupAccountFlowChimeraActivity, eswmVar6.d);
                ahpwVar.g(setBackupAccountFlowChimeraActivity, eswmVar6.e);
                ahpwVar.b(setBackupAccountFlowChimeraActivity, eswmVar6.f);
                ahpwVar.c(setBackupAccountFlowChimeraActivity, eswmVar6.h);
                if (asiu.a().d(setBackupAccountFlowChimeraActivity, new Intent().setClassName(setBackupAccountFlowChimeraActivity, "com.google.android.gms.backup.BackupAccountManagerService"), new ajmu(setBackupAccountFlowChimeraActivity, account), 1)) {
                    return;
                }
                SetBackupAccountFlowChimeraActivity.j.f("Cannot connect to BackupAccountManagerService.", new Object[0]);
                setBackupAccountFlowChimeraActivity.finishAndRemoveTask();
            }
        };
        boolean b = ahrj.b();
        int i = R.string.empty_string;
        int i2 = true != b ? R.string.empty_string : R.string.drive_backup_disabled_encryption_supported_info;
        boolean c = ajks.c(this);
        if (true == c) {
            i = R.string.drive_backup_disabled_detailedinfo;
        }
        int i3 = true != c ? R.string.drive_backup_disabled_backuplist_no_photos : R.string.drive_backup_disabled_backuplist;
        eswu eswuVar = eswu.a;
        eswt eswtVar = (eswt) eswuVar.v();
        eswtVar.k(R.string.drive_backup_disabled_introduction);
        eswtVar.k(R.string.common_learn_more);
        eswtVar.k(i3);
        eswtVar.k(i);
        eswtVar.k(i2);
        this.z = (eswu) eswtVar.Q();
        fecj fecjVar = this.B;
        int[] iArr = ajks.d(this) ? new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_pixel_v2_no_drive, R.string.backup_opt_in_backup_main_message_no_branding, R.string.backup_opt_in_backup_photos_sync, R.string.backup_opt_in_backup_photos_no_quota} : ajks.b(this) ? new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_v2, R.string.backup_opt_in_backup_main_message_no_branding, R.string.backup_opt_in_backup_photos_sync, R.string.backup_opt_in_backup_photos_count_against_quota} : new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_no_photos_v2_no_drive, R.string.backup_opt_in_backup_main_message_no_branding};
        eswt eswtVar2 = (eswt) eswuVar.v();
        eswtVar2.a(ennt.j(iArr));
        eswtVar2.k(R.string.common_privacy_policy_composed_string);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        eswh eswhVar = (eswh) fecjVar.b;
        eswu eswuVar2 = (eswu) eswtVar2.Q();
        eswh eswhVar2 = eswh.a;
        eswuVar2.getClass();
        eswhVar.e = eswuVar2;
        eswhVar.b |= 4;
        eswt eswtVar3 = (eswt) eswu.a.v();
        eswtVar3.k(R.string.close_button_label);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        eswh eswhVar3 = (eswh) fecjVar.b;
        eswu eswuVar3 = (eswu) eswtVar3.Q();
        eswuVar3.getClass();
        eswhVar3.g = eswuVar3;
        eswhVar3.b |= 16;
        this.l.setMovementMethod(LinkMovementMethod.getInstance());
        if (flpk.a.a().a()) {
            this.l.setGravity(17);
            this.l.setText(ajks.e(this, this.z, this.B));
            this.m.setVisibility(0);
            this.m.setText(ajks.a(this, this.z));
        } else {
            this.l.setGravity(8388611);
            TextView textView = this.l;
            eswu eswuVar4 = this.z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajks.e(this, eswuVar4, this.B));
            spannableStringBuilder.append((CharSequence) "\n\n").append(ajks.a(this, eswuVar4));
            textView.setText(spannableStringBuilder);
            this.m.setVisibility(8);
        }
        this.v.setVisibility(0);
        this.v.setText(R.string.change_backup_account_button_label);
        this.v.setOnClickListener(new View.OnClickListener() { // from class: ajmq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity.this.b();
            }
        });
        if (!getIntent().getBooleanExtra("turnOff", false)) {
            this.o.f(4);
        } else {
            this.o.f(0);
            this.o.f = new View.OnClickListener() { // from class: ajmr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetBackupAccountFlowChimeraActivity.this.f();
                }
            };
        }
    }

    public final esws a() {
        fecj v = esws.a.v();
        eswu eswuVar = this.z;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        esws eswsVar = (esws) fecpVar;
        eswuVar.getClass();
        eswsVar.d = eswuVar;
        eswsVar.b |= 2;
        fecj fecjVar = this.B;
        if (!fecpVar.L()) {
            v.U();
        }
        esws eswsVar2 = (esws) v.b;
        eswh eswhVar = (eswh) fecjVar.Q();
        eswhVar.getClass();
        eswsVar2.e = eswhVar;
        eswsVar2.b |= 4;
        eswh eswhVar2 = this.A;
        if (!v.b.L()) {
            v.U();
        }
        esws eswsVar3 = (esws) v.b;
        eswhVar2.getClass();
        eswsVar3.c = eswhVar2;
        eswsVar3.b |= 1;
        return (esws) v.Q();
    }

    public final void b() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
        className.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
        className.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
        startActivity(className);
    }

    @Override // defpackage.ajmw
    public final void c() {
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
        fecj v3 = eswm.a.v();
        fecj v4 = esyr.a.v();
        esyq esyqVar = esyq.DISABLED;
        if (!v4.b.L()) {
            v4.U();
        }
        esyr esyrVar = (esyr) v4.b;
        esyrVar.c = esyqVar.d;
        esyrVar.b |= 1;
        if (!v3.b.L()) {
            v3.U();
        }
        eswm eswmVar = (eswm) v3.b;
        esyr esyrVar2 = (esyr) v4.Q();
        esyrVar2.getClass();
        eswmVar.c = esyrVar2;
        eswmVar.b |= 1;
        eswm eswmVar2 = (eswm) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar = (esxp) v2.b;
        eswmVar2.getClass();
        esxpVar.h = eswmVar2;
        esxpVar.b |= 8;
        esyj esyjVar = (esyj) esyk.a.v();
        esyjVar.a(11);
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
        fecj v5 = esys.a.v();
        esiu esiuVar = esiu.X;
        if (!v5.b.L()) {
            v5.U();
        }
        esys esysVar = (esys) v5.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        fecj v6 = esyo.a.v();
        eswh eswhVar = this.A;
        fecj fecjVar = (fecj) eswhVar.iB(5, null);
        fecjVar.X(eswhVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        eswh eswhVar2 = (eswh) fecjVar.b;
        eswh eswhVar3 = eswh.a;
        eswhVar2.b |= 1;
        eswhVar2.c = true;
        this.A = (eswh) fecjVar.Q();
        esws a = a();
        if (!v6.b.L()) {
            v6.U();
        }
        esyo esyoVar = (esyo) v6.b;
        a.getClass();
        esyoVar.h = a;
        esyoVar.b |= 128;
        if (!v5.b.L()) {
            v5.U();
        }
        esys esysVar2 = (esys) v5.b;
        esyo esyoVar2 = (esyo) v6.Q();
        esyoVar2.getClass();
        esysVar2.d = esyoVar2;
        esysVar2.b |= 8;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar2 = (esxa) eswzVar.b;
        esys esysVar3 = (esys) v5.Q();
        esysVar3.getClass();
        esxaVar2.g = esysVar3;
        esxaVar2.b |= 8;
        ahws.c(this, eswzVar, this.q).x(new dfae() { // from class: ajml
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                arxo arxoVar = SetBackupAccountFlowChimeraActivity.j;
                if (dfaqVar.m()) {
                    return;
                }
                SetBackupAccountFlowChimeraActivity.j.g("Exception writing audit record", dfaqVar.h(), new Object[0]);
            }
        });
        this.x.g(false);
        k();
    }

    public final void f() {
        eswh eswhVar = this.A;
        fecj fecjVar = (fecj) eswhVar.iB(5, null);
        fecjVar.X(eswhVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        eswh eswhVar2 = (eswh) fecjVar.b;
        eswh eswhVar3 = eswh.a;
        eswhVar2.b |= 1;
        eswhVar2.c = true;
        this.A = (eswh) fecjVar.Q();
        new ajmx().show(getSupportFragmentManager(), "TurnOffBackupConfirmationDialog");
    }

    public final void g(String str) {
        setTitle(R.string.backup_account_added_title);
        this.k.H(R.string.backup_account_added_title);
        this.l.setGravity(17);
        this.l.setText(getString(R.string.backup_account_added_description, new Object[]{str}));
        this.m.setVisibility(8);
        this.n.d(getString(R.string.common_done));
        this.n.f = new View.OnClickListener() { // from class: ajms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity.this.finishAndRemoveTask();
            }
        };
        this.o.f(4);
        this.u.setVisibility(4);
        this.v.setVisibility(4);
    }

    public final void h(String str) {
        if (getIntent().getBooleanExtra("showDone", false)) {
            g(str);
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        j.j("onCreate", new Object[0]);
        if (flom.a.a().j()) {
            int i = edjs.a;
            boolean v = edeq.v(this);
            edjt d = edjt.d();
            int i2 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new edjt(edjs.b(this), v).c("", !v));
        } else {
            setTheme(R.style.BackupGlifV3DayNight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.set_backup_account_flow);
        this.k = (GlifLayout) findViewById(R.id.set_backup_account_layout);
        this.l = (TextView) findViewById(R.id.set_backup_account_description);
        this.m = (TextView) findViewById(R.id.set_backup_account_description_body);
        this.u = (TextView) findViewById(R.id.backup_account);
        this.v = (Button) findViewById(R.id.change_backup_account);
        this.p = new ahhp(this);
        this.x = new ahpv(this);
        this.z = eswu.a;
        this.B = eswh.a.v();
        this.A = ajmx.x();
        fecj v2 = eswm.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        eswm eswmVar = (eswm) fecpVar;
        eswmVar.b |= 2;
        eswmVar.d = true;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        eswm eswmVar2 = (eswm) fecpVar2;
        eswmVar2.b |= 4;
        eswmVar2.e = true;
        if (!fecpVar2.L()) {
            v2.U();
        }
        eswm eswmVar3 = (eswm) v2.b;
        eswmVar3.b |= 8;
        eswmVar3.f = true;
        boolean b = ahrj.b();
        if (!v2.b.L()) {
            v2.U();
        }
        eswm eswmVar4 = (eswm) v2.b;
        eswmVar4.b |= 32;
        eswmVar4.h = b;
        this.r = (eswm) v2.Q();
        edfq edfqVar = (edfq) this.k.q(edfq.class);
        edfr edfrVar = new edfr(this);
        edfrVar.c = 5;
        edfrVar.d = R.style.SudGlifButton_Primary;
        edfqVar.b(edfrVar.a());
        edfr edfrVar2 = new edfr(this);
        edfrVar2.c = 7;
        edfrVar2.d = R.style.SudGlifButton_Secondary;
        edfqVar.c(edfrVar2.a());
        this.n = edfqVar.i;
        edfs edfsVar = edfqVar.j;
        this.o = edfsVar;
        edfsVar.d(getString(R.string.common_turn_off));
        l();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        j.j("onNewIntent", new Object[0]);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        AsyncTask asyncTask = this.w;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.w = null;
        }
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        super.onResume();
        if (this.x.k()) {
            l();
        } else {
            k();
        }
    }
}
