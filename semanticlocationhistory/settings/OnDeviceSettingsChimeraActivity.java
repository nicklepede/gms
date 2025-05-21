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
import com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsChimeraActivity;
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
import defpackage.dbja;
import defpackage.dbjb;
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
import defpackage.qet;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OnDeviceSettingsChimeraActivity extends qet implements dbhs {
    public static final /* synthetic */ int t = 0;
    private static final dacv u;
    private LinearLayout A;
    public Account j;
    public View k;
    public TextView l;
    public TextView m;
    public czlk n;
    public dblm o;
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
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OnDeviceSettings");
        dacv dacvVar = new dacv();
        dacvVar.c("essential_data_controls");
        u = dacvVar;
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
            n(getString(R.string.delete_no_account_text));
            return;
        }
        dacv dacvVar = u;
        dacvVar.b(account);
        dfaq d = new dayy(this, dacvVar.a()).d();
        d.z(new dfak() { // from class: dbio
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                if (frwk.c()) {
                    Account account2 = onDeviceSettingsChimeraActivity.j;
                    eiig.x(account2);
                    final String k = onDeviceSettingsChimeraActivity.k(dadh.w(onDeviceSettingsChimeraActivity.getApplication()), account2);
                    onDeviceSettingsChimeraActivity.runOnUiThread(new Runnable() { // from class: dbiu
                        @Override // java.lang.Runnable
                        public final void run() {
                            OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                            TextView textView = onDeviceSettingsChimeraActivity2.l;
                            String str = k;
                            textView.setText(str);
                            onDeviceSettingsChimeraActivity2.l.setContentDescription(str);
                        }
                    });
                }
                onDeviceSettingsChimeraActivity.n(onDeviceSettingsChimeraActivity.getString(R.string.delete_completed_text));
                onDeviceSettingsChimeraActivity.p.e("EdcDeleteSuccess");
            }
        });
        d.y(new dfah() { // from class: dbip
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                onDeviceSettingsChimeraActivity.n(onDeviceSettingsChimeraActivity.getString(R.string.delete_failed_text));
                onDeviceSettingsChimeraActivity.p.e("EdcDeleteFailure");
            }
        });
    }

    @Override // defpackage.dbhs
    public final void c() {
        if (this.j == null) {
            n(getString(R.string.download_no_account_text));
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/json");
        intent.putExtra("android.intent.extra.TITLE", String.valueOf(getString(R.string.timeline_logo_description)).concat(".json"));
        this.s.b(intent);
    }

    public final String k(dade dadeVar, Account account) {
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

    public final void l() {
        final Account account = this.j;
        eiig.x(account);
        if (dbob.c(account, this.n)) {
            final dadh w = dadh.w(getApplication());
            this.v.execute(new Runnable() { // from class: dbiz
                @Override // java.lang.Runnable
                public final void run() {
                    final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                    czlk czlkVar = onDeviceSettingsChimeraActivity.n;
                    czlk czlkVar2 = czlp.a;
                    Account account2 = account;
                    final String string = czlkVar.R(account2) ? onDeviceSettingsChimeraActivity.getResources().getString(R.string.timeline_is_on) : onDeviceSettingsChimeraActivity.getResources().getString(R.string.timeline_is_off);
                    final String k = onDeviceSettingsChimeraActivity.k(w, account2);
                    onDeviceSettingsChimeraActivity.runOnUiThread(new Runnable() { // from class: dbiv
                        @Override // java.lang.Runnable
                        public final void run() {
                            OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                            TextView textView = onDeviceSettingsChimeraActivity2.m;
                            String str = string;
                            textView.setText(str);
                            onDeviceSettingsChimeraActivity2.m.setContentDescription(str);
                            TextView textView2 = onDeviceSettingsChimeraActivity2.l;
                            String str2 = k;
                            textView2.setText(str2);
                            onDeviceSettingsChimeraActivity2.l.setContentDescription(str2);
                        }
                    });
                    if (frwk.c()) {
                        onDeviceSettingsChimeraActivity.o.x(account2.name);
                    }
                }
            });
            return;
        }
        finish();
        abv abvVar = this.r;
        Account account2 = this.j;
        eiig.x(account2);
        abvVar.b(dbob.a(227, account2.name));
    }

    public final void m(String str) {
        ebzi u2 = ebzi.u(new ContextThemeWrapper(this, R.style.Theme_MyApp), this.k, str, 4000);
        u2.w(getColor(R.color.color_blue_300));
        u2.i();
    }

    public final void n(String str) {
        if (frwk.c()) {
            m(str);
        } else {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (this.n == null) {
                this.n = new czlk(this.p);
            }
            if (czlp.g(this, this.n)) {
                setTheme(R.style.TimelineAppThemeSILK);
                setContentView(R.layout.on_device_settings);
                this.k = findViewById(R.id.on_device_settings_details_layout);
                this.l = (TextView) findViewById(R.id.your_timeline_subtitle);
                this.w = (LinearLayout) findViewById(R.id.timeline_status);
                this.m = (TextView) findViewById(R.id.timeline_status_title);
                this.x = (LinearLayout) findViewById(R.id.your_timeline);
                this.w.setOnClickListener(new View.OnClickListener() { // from class: dbin
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        abv abvVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(227, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.x.setOnClickListener(new View.OnClickListener() { // from class: dbir
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        abv abvVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(220, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcTimelineClicked");
                    }
                });
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.settings_details_export_timeline);
                this.y = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: dbis
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        dbhr x = dbhr.x(account);
                        x.ah = onDeviceSettingsChimeraActivity;
                        x.show(onDeviceSettingsChimeraActivity.getSupportFragmentManager(), "export");
                        onDeviceSettingsChimeraActivity.p.e("EdcExportClicked");
                    }
                });
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.settings_details_delete_timeline);
                this.z = linearLayout2;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: dbit
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        dbhn x = dbhn.x(account);
                        x.ah = onDeviceSettingsChimeraActivity;
                        x.show(onDeviceSettingsChimeraActivity.getSupportFragmentManager(), "delete");
                        onDeviceSettingsChimeraActivity.p.e("EdcDeleteClicked");
                    }
                });
                LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.settings_details_encrypted_backup);
                this.A = linearLayout3;
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: dbin
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        abv abvVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        abvVar.b(dbob.a(227, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.q = registerForActivityResult(new acl(), new dbja(this));
                this.r = registerForActivityResult(new acl(), new dbjb(this));
                this.s = registerForActivityResult(new acl(), new abt() { // from class: dbiq
                    @Override // defpackage.abt
                    public final void jq(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i = activityResult.a;
                        final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        if (i != -1) {
                            onDeviceSettingsChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        Intent intent = activityResult.b;
                        if (intent == null) {
                            onDeviceSettingsChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        final Uri data = intent.getData();
                        if (data == null) {
                            onDeviceSettingsChimeraActivity.p.e("EdcExportNotStarted");
                            return;
                        }
                        onDeviceSettingsChimeraActivity.n(onDeviceSettingsChimeraActivity.getString(R.string.download_start_text));
                        dbpc dbpcVar = new dbpc(onDeviceSettingsChimeraActivity);
                        Account account = onDeviceSettingsChimeraActivity.j;
                        eiig.x(account);
                        dfaq a = dbpcVar.a(account, data);
                        a.z(new dfak() { // from class: dbiw
                            @Override // defpackage.dfak
                            public final void gn(Object obj2) {
                                final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                                if (frwk.c()) {
                                    final Intent addFlags = new Intent("android.intent.action.VIEW").setData(data).addFlags(1);
                                    if (addFlags.resolveActivityInfo(onDeviceSettingsChimeraActivity2.getPackageManager(), 0) != null) {
                                        ebzi u2 = ebzi.u(new ContextThemeWrapper(onDeviceSettingsChimeraActivity2, R.style.Theme_MyApp), onDeviceSettingsChimeraActivity2.k, onDeviceSettingsChimeraActivity2.getString(R.string.download_completed_text), 4000);
                                        u2.z(R.string.view_file_action_text, new View.OnClickListener() { // from class: dbiy
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                OnDeviceSettingsChimeraActivity.this.startActivity(addFlags);
                                            }
                                        });
                                        u2.w(onDeviceSettingsChimeraActivity2.getColor(R.color.color_blue_300));
                                        u2.i();
                                    } else {
                                        onDeviceSettingsChimeraActivity2.m(onDeviceSettingsChimeraActivity2.getString(R.string.download_completed_text));
                                    }
                                } else {
                                    onDeviceSettingsChimeraActivity2.n(onDeviceSettingsChimeraActivity2.getString(R.string.download_completed_text));
                                }
                                onDeviceSettingsChimeraActivity2.p.e("EdcExportSuccess");
                            }
                        });
                        a.y(new dfah() { // from class: dbix
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                                onDeviceSettingsChimeraActivity2.n(onDeviceSettingsChimeraActivity2.getString(R.string.download_failed_text));
                                onDeviceSettingsChimeraActivity2.p.e("EdcExportFailure");
                            }
                        });
                    }
                });
                if (frwk.c()) {
                    dblm dblmVar = new dblm();
                    this.o = dblmVar;
                    dblmVar.a = this;
                    bp bpVar = new bp(getSupportFragmentManager());
                    bpVar.v(this.o, "toolbar");
                    bpVar.a();
                    addMenuProvider(this.o);
                }
                List h = asnd.h(this, getPackageName());
                if (h.size() == 1) {
                    this.j = (Account) h.get(0);
                    l();
                    return;
                } else {
                    if (h.isEmpty()) {
                        return;
                    }
                    o();
                    return;
                }
            }
        } catch (IOException unused) {
        }
        finish();
    }
}
