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
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.asvl;
import defpackage.asvo;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bp;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.dcnd;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.ddjg;
import defpackage.ddsa;
import defpackage.ddtw;
import defpackage.dduk;
import defpackage.ddul;
import defpackage.ddvs;
import defpackage.ddyh;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.eelx;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.fgub;
import defpackage.fure;
import defpackage.rzk;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnDeviceSettingsV31ChimeraActivity extends rzk implements ddsa {
    public static final /* synthetic */ int t = 0;
    private static final dcnd u;
    private LinearLayout A;
    private ddtw B;
    public Account j;
    public View k;
    public TextView l;
    public TextView m;
    public ddvs n;
    public dbvg o;
    aca q;
    public aca r;
    aca s;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private LinearLayout z;
    private final ExecutorService v = caqb.b.e(1, caqh.LOW_POWER);
    public final dbtc p = new dbtc();

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OnDeviceSettingsV31");
        dcnd dcndVar = new dcnd();
        dcndVar.c("essential_data_controls");
        u = dcndVar;
    }

    private final aca l() {
        return registerForActivityResult(new acq(), new dduk(this));
    }

    private final aca m() {
        return registerForActivityResult(new acq(), new ddul(this));
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
        asvl asvlVar = new asvl();
        asvlVar.c(Arrays.asList("com.google"));
        asvlVar.a = null;
        asvlVar.d();
        asvlVar.c = getString(R.string.timeline_settings_title);
        asvlVar.f = 1001;
        asvlVar.e();
        this.q.b(asvo.a(asvlVar.a()));
    }

    @Override // defpackage.ddsa
    public final void a() {
        o();
    }

    @Override // defpackage.ddsa
    public final void b() {
        Account account = this.j;
        if (account == null) {
            k(getString(R.string.delete_no_account_text));
            return;
        }
        dcnd dcndVar = u;
        dcndVar.b(account);
        dhlw d = new ddjg(this, dcndVar.a()).d();
        d.z(new dhlq() { // from class: ddty
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                if (fure.c()) {
                    Account account2 = onDeviceSettingsV31ChimeraActivity.j;
                    ekvl.y(account2);
                    final String f = onDeviceSettingsV31ChimeraActivity.f(dcnp.w(onDeviceSettingsV31ChimeraActivity.getApplication()), account2);
                    onDeviceSettingsV31ChimeraActivity.runOnUiThread(new Runnable() { // from class: dduc
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
        d.y(new dhln() { // from class: ddtz
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                onDeviceSettingsV31ChimeraActivity.k(onDeviceSettingsV31ChimeraActivity.getString(R.string.delete_failed_text));
                onDeviceSettingsV31ChimeraActivity.p.e("EdcDeleteFailure");
            }
        });
    }

    @Override // defpackage.ddsa
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

    public final String f(dcnm dcnmVar, Account account) {
        int e = dcnmVar.e(account);
        if (e <= 0) {
            return getResources().getString(R.string.your_timeline_no_segment_text);
        }
        ekvi i = dcnmVar.i(account);
        if (!i.h()) {
            return getResources().getQuantityString(R.plurals.visit_count_text, e, Integer.valueOf(e));
        }
        return getResources().getQuantityString(R.plurals.visit_count_text_with_date, e, Integer.valueOf(e), ddyh.b(getResources().getConfiguration().locale, (fgub) i.c()));
    }

    public final void g() {
        final Account account = this.j;
        ekvl.y(account);
        if (!ddyh.c(account, this.o)) {
            finish();
            aca acaVar = this.r;
            Account account2 = this.j;
            ekvl.y(account2);
            acaVar.b(ddyh.a(227, account2.name));
            return;
        }
        if (!fure.d()) {
            final dcnp w = dcnp.w(getApplication());
            this.v.execute(new Runnable() { // from class: ddud
                @Override // java.lang.Runnable
                public final void run() {
                    final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                    dbvg dbvgVar = onDeviceSettingsV31ChimeraActivity.o;
                    dbvg dbvgVar2 = dbvl.a;
                    Account account3 = account;
                    final String string = dbvgVar.R(account3) ? onDeviceSettingsV31ChimeraActivity.getResources().getString(R.string.timeline_is_on) : onDeviceSettingsV31ChimeraActivity.getResources().getString(R.string.timeline_is_off);
                    final String f = onDeviceSettingsV31ChimeraActivity.f(w, account3);
                    onDeviceSettingsV31ChimeraActivity.runOnUiThread(new Runnable() { // from class: dduf
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
                    if (fure.c()) {
                        onDeviceSettingsV31ChimeraActivity.n.x(account3.name);
                    }
                }
            });
            return;
        }
        this.B = new ddtw(this.o, account);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, this.B);
        bpVar.a();
        this.n.x(account.name);
    }

    public final void h(String str) {
        eelx u2 = eelx.u(new ContextThemeWrapper(this, R.style.Theme_MyApp), this.k, str, 4000);
        u2.w(getColor(R.color.color_blue_300));
        u2.i();
    }

    public final void k(String str) {
        if (fure.c()) {
            h(str);
        } else {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (this.o == null) {
                this.o = new dbvg(this.p);
            }
            if (dbvl.g(this, this.o)) {
                if (fure.d()) {
                    setContentView(R.layout.on_device_settings_preference_layout);
                    this.q = l();
                    this.r = m();
                    ddvs ddvsVar = new ddvs();
                    this.n = ddvsVar;
                    ddvsVar.a = this;
                    bp bpVar = new bp(getSupportFragmentManager());
                    bpVar.t(R.id.action_bar, this.n);
                    bpVar.a();
                    addMenuProvider(this.n);
                    n(auqx.h(this, getPackageName()));
                    return;
                }
                setTheme(R.style.TimelineAppThemeSILK);
                setContentView(R.layout.on_device_settings_v31);
                this.k = findViewById(R.id.on_device_settings_details_layout);
                this.m = (TextView) findViewById(R.id.your_timeline_subtitle);
                this.w = (LinearLayout) findViewById(R.id.timeline_status);
                this.l = (TextView) findViewById(R.id.timeline_status_title);
                this.x = (LinearLayout) findViewById(R.id.your_timeline);
                this.w.setOnClickListener(new View.OnClickListener() { // from class: ddug
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        aca acaVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(227, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.x.setOnClickListener(new View.OnClickListener() { // from class: dduh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        aca acaVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(220, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcTimelineClicked");
                    }
                });
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.settings_details_export_timeline);
                this.y = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ddui
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        ddrz x = ddrz.x(account);
                        x.ah = onDeviceSettingsV31ChimeraActivity;
                        x.show(onDeviceSettingsV31ChimeraActivity.getSupportFragmentManager(), "export");
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcExportClicked");
                    }
                });
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.settings_details_delete_timeline);
                this.z = linearLayout2;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: dduj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        ddrv x = ddrv.x(account);
                        x.ah = onDeviceSettingsV31ChimeraActivity;
                        x.show(onDeviceSettingsV31ChimeraActivity.getSupportFragmentManager(), "delete");
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcDeleteClicked");
                    }
                });
                LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.settings_details_encrypted_backup);
                this.A = linearLayout3;
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: ddug
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity = OnDeviceSettingsV31ChimeraActivity.this;
                        aca acaVar = onDeviceSettingsV31ChimeraActivity.r;
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(227, account.name));
                        onDeviceSettingsV31ChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.q = l();
                this.r = m();
                this.s = registerForActivityResult(new acq(), new aby() { // from class: ddua
                    @Override // defpackage.aby
                    public final void jF(Object obj) {
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
                        ddzi ddziVar = new ddzi(onDeviceSettingsV31ChimeraActivity);
                        Account account = onDeviceSettingsV31ChimeraActivity.j;
                        ekvl.y(account);
                        dhlw a = ddziVar.a(account, data);
                        a.z(new dhlq() { // from class: ddtx
                            @Override // defpackage.dhlq
                            public final void gC(Object obj2) {
                                final OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                                if (fure.c()) {
                                    final Intent addFlags = new Intent("android.intent.action.VIEW").setData(data).addFlags(1);
                                    if (addFlags.resolveActivityInfo(onDeviceSettingsV31ChimeraActivity2.getPackageManager(), 0) != null) {
                                        eelx u2 = eelx.u(new ContextThemeWrapper(onDeviceSettingsV31ChimeraActivity2, R.style.Theme_MyApp), onDeviceSettingsV31ChimeraActivity2.k, onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_completed_text), 4000);
                                        u2.z(R.string.view_file_action_text, new View.OnClickListener() { // from class: ddue
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
                        a.y(new dhln() { // from class: ddub
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                OnDeviceSettingsV31ChimeraActivity onDeviceSettingsV31ChimeraActivity2 = OnDeviceSettingsV31ChimeraActivity.this;
                                onDeviceSettingsV31ChimeraActivity2.k(onDeviceSettingsV31ChimeraActivity2.getString(R.string.download_failed_text));
                                onDeviceSettingsV31ChimeraActivity2.p.e("EdcExportFailure");
                            }
                        });
                    }
                });
                if (fure.c()) {
                    ddvs ddvsVar2 = new ddvs();
                    this.n = ddvsVar2;
                    ddvsVar2.a = this;
                    bp bpVar2 = new bp(getSupportFragmentManager());
                    bpVar2.t(R.id.action_bar, this.n);
                    bpVar2.a();
                    addMenuProvider(this.n);
                }
                n(auqx.h(this, getPackageName()));
            }
        } catch (IOException unused) {
        }
    }
}
