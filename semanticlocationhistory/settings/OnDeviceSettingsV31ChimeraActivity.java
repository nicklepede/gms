package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsV31ChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.aqsv;
import defpackage.aqsy;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.bp;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dacv;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dayy;
import defpackage.dbhs;
import defpackage.dbjq;
import defpackage.dbke;
import defpackage.dbkf;
import defpackage.dblm;
import defpackage.dbob;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.ebzi;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.fefi;
import defpackage.frwk;
import defpackage.qgg;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OnDeviceSettingsV31ChimeraActivity extends qgg implements dbhs {
    public static final /* synthetic */ int t = 0;
    private static final dacv u;
    private LinearLayout A;
    private dbjq B;
    public Account j;
    public View k;
    public TextView l;
    public TextView m;
    public dblm n;
    public czlk o;
    abv q;
    public abv r;
    abv s;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private LinearLayout z;
    private final ExecutorService v = byhj.b.e(1, byhp.LOW_POWER);
    public final czje p = new czje();

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OnDeviceSettingsV31");
        dacv dacvVar = new dacv();
        dacvVar.c("essential_data_controls");
        u = dacvVar;
    }

    private final abv l() {
        return registerForActivityResult(new acl(), new dbke(this));
    }

    private final abv m() {
        return registerForActivityResult(new acl(), new dbkf(this));
    }

    private final void n(List list) {
        if (list.size() == 1) {
            this.j = (Account) list.get(0);
            g();
        } else {
            if (list.isEmpty()) {
                return;
            }
            o();
        }
    }

    private final void o() {
        aqsv aqsvVar = new aqsv();
        aqsvVar.c(Arrays.asList("com.google"));
        aqsvVar.a = null;
        aqsvVar.d();
        aqsvVar.c = getString(R.string.timeline_settings_title);
        aqsvVar.f = 1001;
        aqsvVar.e();
        this.q.b(aqsy.a(aqsvVar.a()));
    }

    @Override // defpackage.dbhs
    public final void a() {
        o();
    }

    @Override // defpackage.dbhs
    public final void b() {
        Account account = this.j;
        if (account == null) {
            k(getString(R.string.delete_no_account_text));
            return;
        }
        dacv dacvVar = u;
        dacvVar.b(account);
        dfaq d = new dayy(this, dacvVar.a()).d();
        d.z(new dfak() { // from class: dbjs
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                if (frwk.c()) {
                    Account account2 = onDeviceSettingsV31ChimeraActivity.j;
                    eiig.x(account2);
                    final String f = onDeviceSettingsV31ChimeraActivity.f(dadh.w(onDeviceSettingsV31ChimeraActivity.getApplication()), account2);
                    onDeviceSettingsV31ChimeraActivity.runOnUiThread(new Runnable() { // from class: dbjw
                        @Override // java.lang.Runnable
                        public final void run() {
                            OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                            TextView textView = onDeviceSettingsV31ChimeraActivity2.m;
                            String str = f;
                            textView.setText(str);
                            onDeviceSettingsV31ChimeraActivity2.m.setContentDescription(str);
                        }
                    });
                }
                onDeviceSettingsV31ChimeraActivity.k(onDeviceSettingsV31ChimeraActivity.getString(R.string.delete_completed_text));
                onDeviceSettingsV31ChimeraActivity.p.e("EdcDeleteSuccess");
            }
        });
        d.y(new dfah() { // from class: dbjt
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                onDeviceSettingsV31ChimeraActivity.k(onDeviceSettingsV31ChimeraActivity.getString(R.string.delete_failed_text));
                onDeviceSettingsV31ChimeraActivity.p.e("EdcDeleteFailure");
            }
        });
    }

    @Override // defpackage.dbhs
    public final void c() {
        if (this.j == null) {
            k(getString(R.string.download_no_account_text));
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/json");
        intent.putExtra("android.intent.extra.TITLE", String.valueOf(getString(R.string.timeline_logo_description)).concat(".json"));
        this.s.b(intent);
    }

    public final String f(dade dadeVar, Account account) {
        int e = dadeVar.e(account);
        if (e <= 0) {
            return getResources().getString(R.string.your_timeline_no_segment_text);
        }
        eiid i = dadeVar.i(account);
        if (!i.h()) {
            return getResources().getQuantityString(R.plurals.visit_count_text, e, Integer.valueOf(e));
        }
        return getResources().getQuantityString(R.plurals.visit_count_text_with_date, e, Integer.valueOf(e), dbob.b(getResources().getConfiguration().locale, (fefi) i.c()));
    }

    public final void g() {
        final Account account = this.j;
        eiig.x(account);
        if (!dbob.c(account, this.o)) {
            finish();
            abv abvVar = this.r;
            Account account2 = this.j;
            eiig.x(account2);
            abvVar.b(dbob.a(227, account2.name));
            return;
        }
        if (!frwk.d()) {
            final dadh w = dadh.w(getApplication());
            this.v.execute(new Runnable() { // from class: dbjx
                @Override // java.lang.Runnable
                public final void run() {
                    final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                    czlk czlkVar = onDeviceSettingsV31ChimeraActivity.o;
                    czlk czlkVar2 = czlp.a;
                    Account account3 = account;
                    final String string = czlkVar.R(account3) ? onDeviceSettingsV31ChimeraActivity.getResources().getString(R.string.timeline_is_on) : onDeviceSettingsV31ChimeraActivity.getResources().getString(R.string.timeline_is_off);
                    final String f = onDeviceSettingsV31ChimeraActivity.f(w, account3);
                    onDeviceSettingsV31ChimeraActivity.runOnUiThread(new Runnable() { // from class: dbjz
                        @Override // java.lang.Runnable
                        public final void run() {
                            OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                            TextView textView = onDeviceSettingsV31ChimeraActivity2.l;
                            String str = string;
                            textView.setText(str);
                            onDeviceSettingsV31ChimeraActivity2.l.setContentDescription(str);
                            TextView textView2 = onDeviceSettingsV31ChimeraActivity2.m;
                            String str2 = f;
                            textView2.setText(str2);
                            onDeviceSettingsV31ChimeraActivity2.m.setContentDescription(str2);
                        }
                    });
                    if (frwk.c()) {
                        onDeviceSettingsV31ChimeraActivity.n.x(account3.name);
                    }
                }
            });
            return;
        }
        this.B = new dbjq(this.o, account);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, this.B);
        bpVar.a();
        this.n.x(account.name);
    }

    public final void h(String str) {
        ebzi u2 = ebzi.u(new ContextThemeWrapper(this, R.style.Theme_MyApp), this.k, str, 4000);
        u2.w(getColor(R.color.color_blue_300));
        u2.i();
    }

    public final void k(String str) {
        if (frwk.c()) {
            h(str);
        } else {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (this.o == null) {
                this.o = new czlk(this.p);
            }
            if (czlp.g(this, this.o)) {
                if (frwk.d()) {
                    setContentView(R.layout.on_device_settings_preference_layout);
                    this.q = l();
                    this.r = m();
                    dblm dblmVar = new dblm();
                    this.n = dblmVar;
                    dblmVar.a = this;
                    bp bpVar = new bp(getSupportFragmentManager());
                    bpVar.t(R.id.action_bar, this.n);
                    bpVar.a();
                    addMenuProvider(this.n);
                    n(asnd.h(this, getPackageName()));
                    return;
                }
                setTheme(R.style.TimelineAppThemeSILK);
                setContentView(R.layout.on_device_settings_v31);
                this.k = findViewById(R.id.on_device_settings_details_layout);
                this.m = (TextView) findViewById(R.id.your_timeline_subtitle);
                this.w = (LinearLayout) findViewById(R.id.timeline_status);
                this.l = (TextView) findViewById(R.id.timeline_status_title);
                this.x = (LinearLayout) findViewById(R.id.your_timeline);
                this.w.setOnClickListener(new View.OnClickListener() { // from class: dbka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        abv abvVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(227, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.x.setOnClickListener(new View.OnClickListener() { // from class: dbkb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        abv abvVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(220, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcTimelineClicked");
                    }
                });
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.settings_details_export_timeline);
                this.y = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: dbkc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        dbhr x = dbhr.x(account);
                        x.ah = onDeviceSettingsV31ChimeraActivity;
                        x.show(onDeviceSettingsV31ChimeraActivity.getSupportFragmentManager(), "export");
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcExportClicked");
                    }
                });
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.settings_details_delete_timeline);
                this.z = linearLayout2;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: dbkd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        dbhn x = dbhn.x(account);
                        x.ah = onDeviceSettingsV31ChimeraActivity;
                        x.show(onDeviceSettingsV31ChimeraActivity.getSupportFragmentManager(), "delete");
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcDeleteClicked");
                    }
                });
                LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.settings_details_encrypted_backup);
                this.A = linearLayout3;
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: dbka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        abv abvVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(227, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.q = l();
                this.r = m();
                this.s = registerForActivityResult(new acl(), new abt() { // from class: dbju
                    @Override // defpackage.abt
                    public final void jq(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i = activityResult.a;
                        final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        if (i != -1) {
                            onDeviceSettingsV31ChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        Intent intent = activityResult.b;
                        if (intent == null) {
                            onDeviceSettingsV31ChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        final Uri data = intent.getData();
                        if (data == null) {
                            onDeviceSettingsV31ChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        onDeviceSettingsV31ChimeraActivity.k(onDeviceSettingsV31ChimeraActivity.getString(R.string.download_start_text));
                        dbpc dbpcVar = new dbpc(onDeviceSettingsV31ChimeraActivity);
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        eiig.x(account);
                        dfaq a = dbpcVar.a(account, data);
                        a.z(new dfak() { // from class: dbjr
                            @Override // defpackage.dfak
                            public final void gn(Object obj2) {
                                final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                                if (frwk.c()) {
                                    final Intent addFlags = new Intent("android.intent.action.VIEW").setData(data).addFlags(1);
                                    if (addFlags.resolveActivityInfo(onDeviceSettingsV31ChimeraActivity2.getPackageManager(), 0) != null) {
                                        ebzi u2 = ebzi.u(new ContextThemeWrapper(onDeviceSettingsV31ChimeraActivity2, R.style.Theme_MyApp), onDeviceSettingsV31ChimeraActivity2.k, onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_completed_text), 4000);
                                        u2.z(R.string.view_file_action_text, new View.OnClickListener() { // from class: dbjy
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                OnDeviceSettingsV31ChimeraActivity.this.startActivity(addFlags);
                                            }
                                        });
                                        u2.w(onDeviceSettingsV31ChimeraActivity2.getColor(R.color.color_blue_300));
                                        u2.i();
                                    } else {
                                        onDeviceSettingsV31ChimeraActivity2.h(onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_completed_text));
                                    }
                                } else {
                                    onDeviceSettingsV31ChimeraActivity2.k(onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_completed_text));
                                }
                                onDeviceSettingsV31ChimeraActivity2.p.e("EdcExportSuccess");
                            }
                        });
                        a.y(new dfah() { // from class: dbjv
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                                onDeviceSettingsV31ChimeraActivity2.k(onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_failed_text));
                                onDeviceSettingsV31ChimeraActivity2.p.e("EdcExportFailure");
                            }
                        });
                    }
                });
                if (frwk.c()) {
                    dblm dblmVar2 = new dblm();
                    this.n = dblmVar2;
                    dblmVar2.a = this;
                    bp bpVar2 = new bp(getSupportFragmentManager());
                    bpVar2.t(R.id.action_bar, this.n);
                    bpVar2.a();
                    addMenuProvider(this.n);
                }
                n(asnd.h(this, getPackageName()));
            }
        } catch (IOException unused) {
        }
    }
}
