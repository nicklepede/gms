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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.arxo;
import defpackage.djlh;
import defpackage.djlj;
import defpackage.djrc;
import defpackage.djtb;
import defpackage.djus;
import defpackage.djvx;
import defpackage.djwe;
import defpackage.djwf;
import defpackage.djwh;
import defpackage.dlul;
import defpackage.ensj;
import defpackage.qfp;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupOptInChimeraActivity extends qfp {
    public static final arxo j = new djlj("WearBackupOptIn");
    static final Optional k = Optional.empty();
    public djrc l;
    public djus m;
    public abv n;
    public abv o;
    public abv p;
    public dlul q;
    public boolean r = false;
    public boolean s = false;

    public static Intent a(String str) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupOptInActivity").putExtra("account_name", str);
    }

    public final void b(String str) {
        ensj.t(this.l.e(), new djwf(this, str), new djvx(this));
    }

    public final void c(final long j2) {
        TextView textView = (TextView) findViewById(R.id.opt_in_summary);
        if (j2 == 0) {
            textView.setText(getString(R.string.wear_backup_opt_in_default_summary));
        } else {
            textView.setText(getString(R.string.wear_backup_opt_in_summary, new Object[]{djlh.b(this, j2)}));
        }
        ((Button) findViewById(R.id.learn_more_btn)).setOnClickListener(new View.OnClickListener() { // from class: djvy
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

    public final void g(final String str, final dlul dlulVar) {
        arxo arxoVar = j;
        arxoVar.j("Showing backup opt-in UI for account %s", arxo.q(str));
        ((TextView) findViewById(R.id.backup_account)).setText(str);
        c(0L);
        ensj.t(this.l.d(str), new djwh(this), new djvx(this));
        ((Button) findViewById(R.id.turn_on_btn)).setOnClickListener(new View.OnClickListener() { // from class: djvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.setClickable(false);
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                djrc djrcVar = wearBackupOptInChimeraActivity.l;
                esiu esiuVar = esiu.amT;
                fecj v = esyt.a.v();
                eswu eswuVar = eswu.a;
                eswt eswtVar = (eswt) eswuVar.v();
                eswtVar.k(R.string.backup_opt_in_title);
                if (!v.b.L()) {
                    v.U();
                }
                esyt esytVar = (esyt) v.b;
                eswu eswuVar2 = (eswu) eswtVar.Q();
                eswuVar2.getClass();
                esytVar.c = eswuVar2;
                esytVar.b |= 1;
                eswu eswuVar3 = eswu.a;
                eswt eswtVar2 = (eswt) eswuVar3.v();
                eswtVar2.k(R.string.wear_backup_opt_in_summary);
                if (!v.b.L()) {
                    v.U();
                }
                esyt esytVar2 = (esyt) v.b;
                eswu eswuVar4 = (eswu) eswtVar2.Q();
                eswuVar4.getClass();
                esytVar2.d = eswuVar4;
                esytVar2.b |= 2;
                eswt eswtVar3 = (eswt) eswuVar3.v();
                eswtVar3.k(R.string.common_turn_on);
                if (!v.b.L()) {
                    v.U();
                }
                esyt esytVar3 = (esyt) v.b;
                eswu eswuVar5 = (eswu) eswtVar3.Q();
                eswuVar5.getClass();
                esytVar3.e = eswuVar5;
                esytVar3.b |= 4;
                if (!v.b.L()) {
                    v.U();
                }
                esyt esytVar4 = (esyt) v.b;
                eswuVar3.getClass();
                esytVar4.f = eswuVar3;
                esytVar4.b |= 8;
                int i = WearBackupLearnMoreChimeraActivity.j;
                eitj s = eitj.s(Integer.valueOf(R.string.backup_opt_in_storage_header), Integer.valueOf(R.string.backup_opt_in_storage_body), Integer.valueOf(R.string.backup_opt_in_scheduling_header), Integer.valueOf(R.string.backup_opt_in_scheduling_body), Integer.valueOf(R.string.backup_opt_in_encryption_header), Integer.valueOf(R.string.backup_opt_in_encryption_body), Integer.valueOf(R.string.backup_opt_in_settings_header_short), Integer.valueOf(R.string.backup_opt_in_settings_body));
                eswt eswtVar4 = (eswt) eswuVar.v();
                eswtVar4.a(s);
                eswu eswuVar6 = (eswu) eswtVar4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                String str2 = str;
                esyt esytVar5 = (esyt) v.b;
                eswuVar6.getClass();
                esytVar5.g = eswuVar6;
                esytVar5.b |= 16;
                ensj.t(djrcVar.b(str2, false, esiuVar, (esyt) v.Q(), null), new djwg(wearBackupOptInChimeraActivity, str2, view), new djvx(wearBackupOptInChimeraActivity));
            }
        });
        Button button = (Button) findViewById(R.id.change_account_btn);
        if (dlulVar.d.size() == 1) {
            arxoVar.j("Only one eligible backup account, not showing change account button", new Object[0]);
            button.setVisibility(8);
        } else {
            arxoVar.j("Multiple eligible backup accounts, showing change account button", new Object[0]);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: djvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abv abvVar = WearBackupOptInChimeraActivity.this.p;
                    eiig.x(abvVar);
                    abvVar.b(dlulVar);
                }
            });
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = (djrc) k.orElseGet(new Supplier() { // from class: djwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return djsc.f(WearBackupOptInChimeraActivity.this);
            }
        });
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_opt_in_activity);
        djtb.a(this, findViewById(R.id.container));
        if (this.m == null) {
            this.m = new djus();
        }
        getOnBackPressedDispatcher().b(this, new djwe(this));
        this.p = WearBackupAccountPickerChimeraActivity.a(this, new abt() { // from class: djwb
            @Override // defpackage.abt
            public final void jq(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                eiig.y(wearBackupOptInChimeraActivity.q, "BackupStatus cache is null.");
                dlul dlulVar = wearBackupOptInChimeraActivity.q;
                if (dlulVar.c) {
                    dluj dlujVar = dlulVar.e;
                    if (dlujVar == null) {
                        dlujVar = dluj.a;
                    }
                    String str2 = dlujVar.c;
                    eiig.x(str);
                    if (eigd.e(str2, str)) {
                        WearBackupOptInChimeraActivity.j.j("Backup already enabled for %s, opening backup settings", arxo.q(str));
                        wearBackupOptInChimeraActivity.startActivity(WearBackupSettingsChimeraActivity.b());
                        wearBackupOptInChimeraActivity.finish();
                        return;
                    }
                }
                wearBackupOptInChimeraActivity.g(str, wearBackupOptInChimeraActivity.q);
            }
        });
        this.o = registerForActivityResult(new acl(), new abt() { // from class: djwc
            @Override // defpackage.abt
            public final void jq(Object obj) {
                WearBackupOptInChimeraActivity.j.j("User finished add account activity", new Object[0]);
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                wearBackupOptInChimeraActivity.s = true;
                wearBackupOptInChimeraActivity.b(null);
            }
        });
        this.n = WearBackupConfirmationChimeraActivity.a(this, new abt() { // from class: djwd
            @Override // defpackage.abt
            public final void jq(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity = WearBackupOptInChimeraActivity.this;
                if (!booleanValue) {
                    WearBackupOptInChimeraActivity.j.j("User chose not to add account, finishing backup opt-in for no account", new Object[0]);
                    wearBackupOptInChimeraActivity.finish();
                } else {
                    WearBackupOptInChimeraActivity.j.j("User chose to add account, launching add account activity", new Object[0]);
                    abv abvVar = wearBackupOptInChimeraActivity.o;
                    eiig.x(abvVar);
                    abvVar.b(new Intent("com.google.android.clockwork.home.accounts.ADD_ACCOUNTS").setClassName("com.google.android.wearable.app", "com.google.android.clockwork.home.accounts.AddAccountActivity"));
                }
            }
        });
        b(getIntent().getStringExtra("account_name"));
    }
}
