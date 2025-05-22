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
import defpackage.ajif;
import defpackage.ajql;
import defpackage.ajrv;
import defpackage.ajsa;
import defpackage.ajwt;
import defpackage.ajxi;
import defpackage.akds;
import defpackage.allk;
import defpackage.alnl;
import defpackage.alno;
import defpackage.alnp;
import defpackage.auad;
import defpackage.aupz;
import defpackage.dhlk;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efsn;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.eqbm;
import defpackage.eqgo;
import defpackage.euyj;
import defpackage.euyl;
import defpackage.evlx;
import defpackage.evmc;
import defpackage.evmi;
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
import defpackage.fofw;
import defpackage.fogu;
import defpackage.ryt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetBackupAccountFlowChimeraActivity extends ryt implements alno {
    public static final auad j = ajwt.a("SetBackupAccountFlow");
    private evlx A;
    private fgrc B;
    public GlifLayout k;
    public TextView l;
    public TextView m;
    public efsn n;
    public efsn o;
    public ajif p;
    public Account q;
    public evmc r;
    public Account s;
    private final eqgo t = new aupz(1, 9);
    private TextView u;
    private Button v;
    private AsyncTask w;
    private ajql x;
    private List y;
    private evmk z;

    private final void k() {
        setTitle(R.string.backup_turned_off_title);
        this.k.H(R.string.backup_turned_off_title);
        this.l.setGravity(17);
        this.l.setText(R.string.backup_turned_off_description);
        this.m.setVisibility(8);
        this.n.d(getString(android.R.string.ok));
        this.n.f = new View.OnClickListener() { // from class: alng
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
        List a = akds.a(this);
        this.y = a;
        if (a.isEmpty()) {
            j.j("No accounts for backup on device, launching add account", new Object[0]);
            b();
            finishAndRemoveTask();
            return;
        }
        if (!ajrv.a()) {
            alnl alnlVar = new alnl(this);
            this.w = alnlVar;
            alnlVar.executeOnExecutor(this.t, new Void[0]);
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
        this.n.f = new View.OnClickListener() { // from class: alnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity = SetBackupAccountFlowChimeraActivity.this;
                Account account = setBackupAccountFlowChimeraActivity.s;
                evmp evmpVar = (evmp) evmq.a.v();
                fgrc v = evne.a.v();
                euyl euylVar = euyl.ANDROID_BACKUP_SET_ACCOUNT;
                if (!v.b.L()) {
                    v.U();
                }
                evne evneVar = (evne) v.b;
                evneVar.c = euylVar.lK;
                evneVar.b |= 1;
                fgrc v2 = evnf.a.v();
                evmc evmcVar = setBackupAccountFlowChimeraActivity.r;
                fgrc fgrcVar = (fgrc) evmcVar.iQ(5, null);
                fgrcVar.X(evmcVar);
                fgrc v3 = evoh.a.v();
                evog evogVar = evog.ENABLED;
                if (!v3.b.L()) {
                    v3.U();
                }
                evoh evohVar = (evoh) v3.b;
                evohVar.c = evogVar.d;
                evohVar.b |= 1;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                evmc evmcVar2 = (evmc) fgrcVar.b;
                evoh evohVar2 = (evoh) v3.Q();
                evmc evmcVar3 = evmc.a;
                evohVar2.getClass();
                evmcVar2.c = evohVar2;
                evmcVar2.b |= 1;
                boolean c = allk.c(setBackupAccountFlowChimeraActivity);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                evmc evmcVar4 = (evmc) fgrcVar.b;
                evmcVar4.b |= 16;
                evmcVar4.g = c;
                setBackupAccountFlowChimeraActivity.r = (evmc) fgrcVar.Q();
                evmc evmcVar5 = setBackupAccountFlowChimeraActivity.r;
                if (!v2.b.L()) {
                    v2.U();
                }
                evnf evnfVar = (evnf) v2.b;
                evmcVar5.getClass();
                evnfVar.h = evmcVar5;
                evnfVar.b |= 8;
                evnz evnzVar = (evnz) evoa.a.v();
                evnzVar.a(12);
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
                euyj euyjVar = euyj.X;
                if (!v4.b.L()) {
                    v4.U();
                }
                evoi evoiVar = (evoi) v4.b;
                evoiVar.c = euyjVar.a();
                evoiVar.b |= 1;
                fgrc v5 = evoe.a.v();
                evmi a2 = setBackupAccountFlowChimeraActivity.a();
                if (!v5.b.L()) {
                    v5.U();
                }
                evoe evoeVar = (evoe) v5.b;
                a2.getClass();
                evoeVar.h = a2;
                evoeVar.b |= 128;
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
                ajxi.c(setBackupAccountFlowChimeraActivity.getApplicationContext(), evmpVar, account).x(new dhlk() { // from class: alnc
                    @Override // defpackage.dhlk
                    public final void hH(dhlw dhlwVar) {
                        auad auadVar = SetBackupAccountFlowChimeraActivity.j;
                        if (dhlwVar.m()) {
                            return;
                        }
                        SetBackupAccountFlowChimeraActivity.j.g("Exception writing audit record", dhlwVar.h(), new Object[0]);
                    }
                });
                evmc evmcVar6 = setBackupAccountFlowChimeraActivity.r;
                ajqm ajqmVar = ajqm.a;
                ajqmVar.d(setBackupAccountFlowChimeraActivity, evmcVar6.d);
                ajqmVar.g(setBackupAccountFlowChimeraActivity, evmcVar6.e);
                ajqmVar.b(setBackupAccountFlowChimeraActivity, evmcVar6.f);
                ajqmVar.c(setBackupAccountFlowChimeraActivity, evmcVar6.h);
                if (aumo.a().d(setBackupAccountFlowChimeraActivity, new Intent().setClassName(setBackupAccountFlowChimeraActivity, "com.google.android.gms.backup.BackupAccountManagerService"), new alnm(setBackupAccountFlowChimeraActivity, account), 1)) {
                    return;
                }
                SetBackupAccountFlowChimeraActivity.j.f("Cannot connect to BackupAccountManagerService.", new Object[0]);
                setBackupAccountFlowChimeraActivity.finishAndRemoveTask();
            }
        };
        boolean b = ajsa.b();
        int i = R.string.empty_string;
        int i2 = true != b ? R.string.empty_string : R.string.drive_backup_disabled_encryption_supported_info;
        boolean c = allk.c(this);
        if (true == c) {
            i = R.string.drive_backup_disabled_detailedinfo;
        }
        int i3 = true != c ? R.string.drive_backup_disabled_backuplist_no_photos : R.string.drive_backup_disabled_backuplist;
        evmk evmkVar = evmk.a;
        evmj evmjVar = (evmj) evmkVar.v();
        evmjVar.k(R.string.drive_backup_disabled_introduction);
        evmjVar.k(R.string.common_learn_more);
        evmjVar.k(i3);
        evmjVar.k(i);
        evmjVar.k(i2);
        this.z = (evmk) evmjVar.Q();
        fgrc fgrcVar = this.B;
        int[] iArr = allk.d(this) ? new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_pixel_v2_no_drive, R.string.backup_opt_in_backup_main_message_no_branding, R.string.backup_opt_in_backup_photos_sync, R.string.backup_opt_in_backup_photos_no_quota} : allk.b(this) ? new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_v2, R.string.backup_opt_in_backup_main_message_no_branding, R.string.backup_opt_in_backup_photos_sync, R.string.backup_opt_in_backup_photos_count_against_quota} : new int[]{R.string.backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_no_photos_v2_no_drive, R.string.backup_opt_in_backup_main_message_no_branding};
        evmj evmjVar2 = (evmj) evmkVar.v();
        evmjVar2.a(eqbm.j(iArr));
        evmjVar2.k(R.string.common_privacy_policy_composed_string);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        evlx evlxVar = (evlx) fgrcVar.b;
        evmk evmkVar2 = (evmk) evmjVar2.Q();
        evlx evlxVar2 = evlx.a;
        evmkVar2.getClass();
        evlxVar.e = evmkVar2;
        evlxVar.b |= 4;
        evmj evmjVar3 = (evmj) evmkVar.v();
        evmjVar3.k(R.string.close_button_label);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        evlx evlxVar3 = (evlx) fgrcVar.b;
        evmk evmkVar3 = (evmk) evmjVar3.Q();
        evmkVar3.getClass();
        evlxVar3.g = evmkVar3;
        evlxVar3.b |= 16;
        this.l.setMovementMethod(LinkMovementMethod.getInstance());
        if (fogu.a.lK().a()) {
            this.l.setGravity(17);
            this.l.setText(allk.e(this, this.z, this.B));
            this.m.setVisibility(0);
            this.m.setText(allk.a(this, this.z));
        } else {
            this.l.setGravity(8388611);
            TextView textView = this.l;
            evmk evmkVar4 = this.z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(allk.e(this, evmkVar4, this.B));
            spannableStringBuilder.append((CharSequence) "\n\n").append(allk.a(this, evmkVar4));
            textView.setText(spannableStringBuilder);
            this.m.setVisibility(8);
        }
        this.v.setVisibility(0);
        this.v.setText(R.string.change_backup_account_button_label);
        this.v.setOnClickListener(new View.OnClickListener() { // from class: alni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetBackupAccountFlowChimeraActivity.this.b();
            }
        });
        if (!getIntent().getBooleanExtra("turnOff", false)) {
            this.o.f(4);
        } else {
            this.o.f(0);
            this.o.f = new View.OnClickListener() { // from class: alnj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetBackupAccountFlowChimeraActivity.this.f();
                }
            };
        }
    }

    public final evmi a() {
        fgrc v = evmi.a.v();
        evmk evmkVar = this.z;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        evmi evmiVar = (evmi) fgriVar;
        evmkVar.getClass();
        evmiVar.d = evmkVar;
        evmiVar.b |= 2;
        fgrc fgrcVar = this.B;
        if (!fgriVar.L()) {
            v.U();
        }
        evmi evmiVar2 = (evmi) v.b;
        evlx evlxVar = (evlx) fgrcVar.Q();
        evlxVar.getClass();
        evmiVar2.e = evlxVar;
        evmiVar2.b |= 4;
        evlx evlxVar2 = this.A;
        if (!v.b.L()) {
            v.U();
        }
        evmi evmiVar3 = (evmi) v.b;
        evlxVar2.getClass();
        evmiVar3.c = evlxVar2;
        evmiVar3.b |= 1;
        return (evmi) v.Q();
    }

    public final void b() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
        className.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
        className.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
        startActivity(className);
    }

    @Override // defpackage.alno
    public final void c() {
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
        fgrc v3 = evmc.a.v();
        fgrc v4 = evoh.a.v();
        evog evogVar = evog.DISABLED;
        if (!v4.b.L()) {
            v4.U();
        }
        evoh evohVar = (evoh) v4.b;
        evohVar.c = evogVar.d;
        evohVar.b |= 1;
        if (!v3.b.L()) {
            v3.U();
        }
        evmc evmcVar = (evmc) v3.b;
        evoh evohVar2 = (evoh) v4.Q();
        evohVar2.getClass();
        evmcVar.c = evohVar2;
        evmcVar.b |= 1;
        evmc evmcVar2 = (evmc) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar = (evnf) v2.b;
        evmcVar2.getClass();
        evnfVar.h = evmcVar2;
        evnfVar.b |= 8;
        evnz evnzVar = (evnz) evoa.a.v();
        evnzVar.a(11);
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
        fgrc v5 = evoi.a.v();
        euyj euyjVar = euyj.X;
        if (!v5.b.L()) {
            v5.U();
        }
        evoi evoiVar = (evoi) v5.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        fgrc v6 = evoe.a.v();
        evlx evlxVar = this.A;
        fgrc fgrcVar = (fgrc) evlxVar.iQ(5, null);
        fgrcVar.X(evlxVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        evlx evlxVar2 = (evlx) fgrcVar.b;
        evlx evlxVar3 = evlx.a;
        evlxVar2.b |= 1;
        evlxVar2.c = true;
        this.A = (evlx) fgrcVar.Q();
        evmi a = a();
        if (!v6.b.L()) {
            v6.U();
        }
        evoe evoeVar = (evoe) v6.b;
        a.getClass();
        evoeVar.h = a;
        evoeVar.b |= 128;
        if (!v5.b.L()) {
            v5.U();
        }
        evoi evoiVar2 = (evoi) v5.b;
        evoe evoeVar2 = (evoe) v6.Q();
        evoeVar2.getClass();
        evoiVar2.d = evoeVar2;
        evoiVar2.b |= 8;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar2 = (evmq) evmpVar.b;
        evoi evoiVar3 = (evoi) v5.Q();
        evoiVar3.getClass();
        evmqVar2.g = evoiVar3;
        evmqVar2.b |= 8;
        ajxi.c(this, evmpVar, this.q).x(new dhlk() { // from class: alnd
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                auad auadVar = SetBackupAccountFlowChimeraActivity.j;
                if (dhlwVar.m()) {
                    return;
                }
                SetBackupAccountFlowChimeraActivity.j.g("Exception writing audit record", dhlwVar.h(), new Object[0]);
            }
        });
        this.x.f(false);
        k();
    }

    public final void f() {
        evlx evlxVar = this.A;
        fgrc fgrcVar = (fgrc) evlxVar.iQ(5, null);
        fgrcVar.X(evlxVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        evlx evlxVar2 = (evlx) fgrcVar.b;
        evlx evlxVar3 = evlx.a;
        evlxVar2.b |= 1;
        evlxVar2.c = true;
        this.A = (evlx) fgrcVar.Q();
        new alnp().show(getSupportFragmentManager(), "TurnOffBackupConfirmationDialog");
    }

    public final void g(String str) {
        setTitle(R.string.backup_account_added_title);
        this.k.H(R.string.backup_account_added_title);
        this.l.setGravity(17);
        this.l.setText(getString(R.string.backup_account_added_description, new Object[]{str}));
        this.m.setVisibility(8);
        this.n.d(getString(R.string.common_done));
        this.n.f = new View.OnClickListener() { // from class: alnk
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

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        j.j("onCreate", new Object[0]);
        if (fofw.a.lK().j()) {
            int i = efwn.a;
            boolean v = efrl.v(this);
            efwo d = efwo.d();
            int i2 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new efwo(efwn.b(this), v).c("", !v));
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
        this.p = new ajif(this);
        this.x = new ajql(this);
        this.z = evmk.a;
        this.B = evlx.a.v();
        this.A = alnp.x();
        fgrc v2 = evmc.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        evmc evmcVar = (evmc) fgriVar;
        evmcVar.b |= 2;
        evmcVar.d = true;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        evmc evmcVar2 = (evmc) fgriVar2;
        evmcVar2.b |= 4;
        evmcVar2.e = true;
        if (!fgriVar2.L()) {
            v2.U();
        }
        evmc evmcVar3 = (evmc) v2.b;
        evmcVar3.b |= 8;
        evmcVar3.f = true;
        boolean b = ajsa.b();
        if (!v2.b.L()) {
            v2.U();
        }
        evmc evmcVar4 = (evmc) v2.b;
        evmcVar4.b |= 32;
        evmcVar4.h = b;
        this.r = (evmc) v2.Q();
        efsl efslVar = (efsl) this.k.q(efsl.class);
        efsm efsmVar = new efsm(this);
        efsmVar.c = 5;
        efsmVar.d = R.style.SudGlifButton_Primary;
        efslVar.b(efsmVar.a());
        efsm efsmVar2 = new efsm(this);
        efsmVar2.c = 7;
        efsmVar2.d = R.style.SudGlifButton_Secondary;
        efslVar.c(efsmVar2.a());
        this.n = efslVar.i;
        efsn efsnVar = efslVar.j;
        this.o = efsnVar;
        efsnVar.d(getString(R.string.common_turn_off));
        l();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        j.j("onNewIntent", new Object[0]);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        AsyncTask asyncTask = this.w;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.w = null;
        }
        super.onPause();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        super.onResume();
        if (this.x.j()) {
            l();
        } else {
            k();
        }
    }
}
