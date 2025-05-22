package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupLearnMoreChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.auad;
import defpackage.dlxa;
import defpackage.dlxc;
import defpackage.dmcv;
import defpackage.dmeu;
import defpackage.dmgl;
import defpackage.dmhq;
import defpackage.dmhx;
import defpackage.dmhy;
import defpackage.dmia;
import defpackage.dogc;
import defpackage.eqgc;
import defpackage.ryt;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupOptInChimeraActivity extends ryt {
    public static final auad j = new dlxc("WearBackupOptIn");
    static final Optional k = Optional.empty();
    public dmcv l;
    public dmgl m;
    public aca n;
    public aca o;
    public aca p;
    public dogc q;
    public boolean r = false;
    public boolean s = false;

    public static Intent a(String str) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupOptInActivity").putExtra("account_name", str);
    }

    public final void b(String str) {
        eqgc.t(this.l.e(), new dmhy(this, str), new dmhq(this));
    }

    public final void c(final long j2) {
        TextView textView = (TextView) findViewById(R.id.opt_in_summary);
        if (j2 == 0) {
            textView.setText(getString(R.string.wear_backup_opt_in_default_summary));
        } else {
            textView.setText(getString(R.string.wear_backup_opt_in_summary, new Object[]{dlxa.b(this, j2)}));
        }
        ((Button) findViewById(R.id.learn_more_btn)).setOnClickListener(new View.OnClickListener() { // from class: dmhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = WearBackupLearnMoreChimeraActivity.j;
                WearBackupOptInChimeraActivity.this.startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupLearnMoreActivity").putExtra("total_quota_bytes", j2));
            }
        });
    }

    public final void f(int i, boolean z) {
        startActivity(WearBackupDialogChimeraActivity.a(getString(i)));
        if (z) {
            finish();
        }
    }

    public final void g(final String str, final dogc dogcVar) {
        auad auadVar = j;
        auadVar.j("Showing backup opt-in UI for account %s", auad.q(str));
        ((TextView) findViewById(R.id.backup_account)).setText(str);
        c(0L);
        eqgc.t(this.l.d(str), new dmia(this), new dmhq(this));
        ((Button) findViewById(R.id.turn_on_btn)).setOnClickListener(new View.OnClickListener() { // from class: dmho
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.setClickable(false);
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                dmcv dmcvVar = wearBackupOptInChimeraActivity.l;
                euyj euyjVar = euyj.anj;
                fgrc v = evoj.a.v();
                evmk evmkVar = evmk.a;
                evmj evmjVar = (evmj) evmkVar.v();
                evmjVar.k(R.string.backup_opt_in_title);
                if (!v.b.L()) {
                    v.U();
                }
                evoj evojVar = (evoj) v.b;
                evmk evmkVar2 = (evmk) evmjVar.Q();
                evmkVar2.getClass();
                evojVar.c = evmkVar2;
                evojVar.b |= 1;
                evmj evmjVar2 = (evmj) evmkVar.v();
                evmjVar2.k(R.string.wear_backup_opt_in_summary);
                if (!v.b.L()) {
                    v.U();
                }
                evoj evojVar2 = (evoj) v.b;
                evmk evmkVar3 = (evmk) evmjVar2.Q();
                evmkVar3.getClass();
                evojVar2.d = evmkVar3;
                evojVar2.b |= 2;
                evmj evmjVar3 = (evmj) evmkVar.v();
                evmjVar3.k(R.string.common_turn_on);
                if (!v.b.L()) {
                    v.U();
                }
                evoj evojVar3 = (evoj) v.b;
                evmk evmkVar4 = (evmk) evmjVar3.Q();
                evmkVar4.getClass();
                evojVar3.e = evmkVar4;
                evojVar3.b |= 4;
                if (!v.b.L()) {
                    v.U();
                }
                evoj evojVar4 = (evoj) v.b;
                evmkVar.getClass();
                evojVar4.f = evmkVar;
                evojVar4.b |= 8;
                int i = WearBackupLearnMoreChimeraActivity.j;
                elgo s = elgo.s(Integer.valueOf(R.string.backup_opt_in_storage_header), Integer.valueOf(R.string.backup_opt_in_storage_body), Integer.valueOf(R.string.backup_opt_in_scheduling_header), Integer.valueOf(R.string.backup_opt_in_scheduling_body), Integer.valueOf(R.string.backup_opt_in_encryption_header), Integer.valueOf(R.string.backup_opt_in_encryption_body), Integer.valueOf(R.string.backup_opt_in_settings_header_short), Integer.valueOf(R.string.backup_opt_in_settings_body));
                evmj evmjVar4 = (evmj) evmkVar.v();
                evmjVar4.a(s);
                evmk evmkVar5 = (evmk) evmjVar4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                String str2 = str;
                evoj evojVar5 = (evoj) v.b;
                evmkVar5.getClass();
                evojVar5.g = evmkVar5;
                evojVar5.b |= 16;
                eqgc.t(dmcvVar.b(str2, false, euyjVar, (evoj) v.Q(), null), new dmhz(wearBackupOptInChimeraActivity, str2, view), new dmhq(wearBackupOptInChimeraActivity));
            }
        });
        Button button = (Button) findViewById(R.id.change_account_btn);
        if (dogcVar.d.size() == 1) {
            auadVar.j("Only one eligible backup account, not showing change account button", new Object[0]);
            button.setVisibility(8);
        } else {
            auadVar.j("Multiple eligible backup accounts, showing change account button", new Object[0]);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: dmhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aca acaVar = WearBackupOptInChimeraActivity.this.p;
                    ekvl.y(acaVar);
                    acaVar.b(dogcVar);
                }
            });
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = (dmcv) k.orElseGet(new Supplier() { // from class: dmht
            @Override // java.util.function.Supplier
            public final Object get() {
                return dmdv.f(WearBackupOptInChimeraActivity.this);
            }
        });
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_opt_in_activity);
        dmeu.a(this, findViewById(R.id.container));
        if (this.m == null) {
            this.m = new dmgl();
        }
        getOnBackPressedDispatcher().b(this, new dmhx(this));
        this.p = WearBackupAccountPickerChimeraActivity.a(this, new aby() { // from class: dmhu
            @Override // defpackage.aby
            public final void jF(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                ekvl.z(wearBackupOptInChimeraActivity.q, "BackupStatus cache is null.");
                dogc dogcVar = wearBackupOptInChimeraActivity.q;
                if (dogcVar.c) {
                    doga dogaVar = dogcVar.e;
                    if (dogaVar == null) {
                        dogaVar = doga.a;
                    }
                    String str2 = dogaVar.c;
                    ekvl.y(str);
                    if (ekti.e(str2, str)) {
                        WearBackupOptInChimeraActivity.j.j("Backup already enabled for %s, opening backup settings", auad.q(str));
                        wearBackupOptInChimeraActivity.startActivity(WearBackupSettingsChimeraActivity.b());
                        wearBackupOptInChimeraActivity.finish();
                        return;
                    }
                }
                wearBackupOptInChimeraActivity.g(str, wearBackupOptInChimeraActivity.q);
            }
        });
        this.o = registerForActivityResult(new acq(), new aby() { // from class: dmhv
            @Override // defpackage.aby
            public final void jF(Object obj) {
                WearBackupOptInChimeraActivity.j.j("User finished add account activity", new Object[0]);
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                wearBackupOptInChimeraActivity.s = true;
                wearBackupOptInChimeraActivity.b(null);
            }
        });
        this.n = WearBackupConfirmationChimeraActivity.a(this, new aby() { // from class: dmhw
            @Override // defpackage.aby
            public final void jF(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                if (!booleanValue) {
                    WearBackupOptInChimeraActivity.j.j("User chose not to add account, finishing backup opt-in for no account", new Object[0]);
                    wearBackupOptInChimeraActivity.finish();
                } else {
                    WearBackupOptInChimeraActivity.j.j("User chose to add account, launching add account activity", new Object[0]);
                    aca acaVar = wearBackupOptInChimeraActivity.o;
                    ekvl.y(acaVar);
                    acaVar.b(new Intent("com.google.android.clockwork.home.accounts.ADD_ACCOUNTS").setClassName("com.google.android.wearable.app", "com.google.android.clockwork.home.accounts.AddAccountActivity"));
                }
            }
        });
        b(getIntent().getStringExtra("account_name"));
    }
}
