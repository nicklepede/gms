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
import defpackage.ddtg;
import defpackage.ddth;
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
import defpackage.rxx;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnDeviceSettingsChimeraActivity extends rxx implements ddsa {
    public static final /* synthetic */ int t = 0;
    private static final dcnd u;
    private LinearLayout A;
    public Account j;
    public View k;
    public TextView l;
    public TextView m;
    public dbvg n;
    public ddvs o;
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
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OnDeviceSettings");
        dcnd dcndVar = new dcnd();
        dcndVar.c("essential_data_controls");
        u = dcndVar;
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
            n(getString(R.string.delete_no_account_text));
            return;
        }
        dcnd dcndVar = u;
        dcndVar.b(account);
        dhlw d = new ddjg(this, dcndVar.a()).d();
        d.z(new dhlq() { // from class: ddsu
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                if (fure.c()) {
                    Account account2 = onDeviceSettingsChimeraActivity.j;
                    ekvl.y(account2);
                    final String k = onDeviceSettingsChimeraActivity.k(dcnp.w(onDeviceSettingsChimeraActivity.getApplication()), account2);
                    onDeviceSettingsChimeraActivity.runOnUiThread(new Runnable() { // from class: ddta
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
        d.y(new dhln() { // from class: ddsv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                onDeviceSettingsChimeraActivity.n(onDeviceSettingsChimeraActivity.getString(R.string.delete_failed_text));
                onDeviceSettingsChimeraActivity.p.e("EdcDeleteFailure");
            }
        });
    }

    @Override // defpackage.ddsa
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

    public final String k(dcnm dcnmVar, Account account) {
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

    public final void l() {
        final Account account = this.j;
        ekvl.y(account);
        if (ddyh.c(account, this.n)) {
            final dcnp w = dcnp.w(getApplication());
            this.v.execute(new Runnable() { // from class: ddtf
                @Override // java.lang.Runnable
                public final void run() {
                    final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                    dbvg dbvgVar = onDeviceSettingsChimeraActivity.n;
                    dbvg dbvgVar2 = dbvl.a;
                    Account account2 = account;
                    final String string = dbvgVar.R(account2) ? onDeviceSettingsChimeraActivity.getResources().getString(R.string.timeline_is_on) : onDeviceSettingsChimeraActivity.getResources().getString(R.string.timeline_is_off);
                    final String k = onDeviceSettingsChimeraActivity.k(w, account2);
                    onDeviceSettingsChimeraActivity.runOnUiThread(new Runnable() { // from class: ddtb
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
                    if (fure.c()) {
                        onDeviceSettingsChimeraActivity.o.x(account2.name);
                    }
                }
            });
            return;
        }
        finish();
        aca acaVar = this.r;
        Account account2 = this.j;
        ekvl.y(account2);
        acaVar.b(ddyh.a(227, account2.name));
    }

    public final void m(String str) {
        eelx u2 = eelx.u(new ContextThemeWrapper(this, R.style.Theme_MyApp), this.k, str, 4000);
        u2.w(getColor(R.color.color_blue_300));
        u2.i();
    }

    public final void n(String str) {
        if (fure.c()) {
            m(str);
        } else {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (this.n == null) {
                this.n = new dbvg(this.p);
            }
            if (dbvl.g(this, this.n)) {
                setTheme(R.style.TimelineAppThemeSILK);
                setContentView(R.layout.on_device_settings);
                this.k = findViewById(R.id.on_device_settings_details_layout);
                this.l = (TextView) findViewById(R.id.your_timeline_subtitle);
                this.w = (LinearLayout) findViewById(R.id.timeline_status);
                this.m = (TextView) findViewById(R.id.timeline_status_title);
                this.x = (LinearLayout) findViewById(R.id.your_timeline);
                this.w.setOnClickListener(new View.OnClickListener() { // from class: ddst
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        aca acaVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(227, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.x.setOnClickListener(new View.OnClickListener() { // from class: ddsx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        aca acaVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(220, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcTimelineClicked");
                    }
                });
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.settings_details_export_timeline);
                this.y = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ddsy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        ddrz x = ddrz.x(account);
                        x.ah = onDeviceSettingsChimeraActivity;
                        x.show(onDeviceSettingsChimeraActivity.getSupportFragmentManager(), "export");
                        onDeviceSettingsChimeraActivity.p.e("EdcExportClicked");
                    }
                });
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.settings_details_delete_timeline);
                this.z = linearLayout2;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ddsz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        ddrv x = ddrv.x(account);
                        x.ah = onDeviceSettingsChimeraActivity;
                        x.show(onDeviceSettingsChimeraActivity.getSupportFragmentManager(), "delete");
                        onDeviceSettingsChimeraActivity.p.e("EdcDeleteClicked");
                    }
                });
                LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.settings_details_encrypted_backup);
                this.A = linearLayout3;
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: ddst
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity = OnDeviceSettingsChimeraActivity.this;
                        aca acaVar = onDeviceSettingsChimeraActivity.r;
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        acaVar.b(ddyh.a(227, account.name));
                        onDeviceSettingsChimeraActivity.p.e("EdcEncryptedBackupClicked");
                    }
                });
                this.q = registerForActivityResult(new acq(), new ddtg(this));
                this.r = registerForActivityResult(new acq(), new ddth(this));
                this.s = registerForActivityResult(new acq(), new aby() { // from class: ddsw
                    @Override // defpackage.aby
                    public final void jF(Object obj) {
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
                        ddzi ddziVar = new ddzi(onDeviceSettingsChimeraActivity);
                        Account account = onDeviceSettingsChimeraActivity.j;
                        ekvl.y(account);
                        dhlw a = ddziVar.a(account, data);
                        a.z(new dhlq() { // from class: ddtc
                            @Override // defpackage.dhlq
                            public final void gC(Object obj2) {
                                final OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                                if (fure.c()) {
                                    final Intent addFlags = new Intent("android.intent.action.VIEW").setData(data).addFlags(1);
                                    if (addFlags.resolveActivityInfo(onDeviceSettingsChimeraActivity2.getPackageManager(), 0) != null) {
                                        eelx u2 = eelx.u(new ContextThemeWrapper(onDeviceSettingsChimeraActivity2, R.style.Theme_MyApp), onDeviceSettingsChimeraActivity2.k, onDeviceSettingsChimeraActivity2.getString(R.string.download_completed_text), 4000);
                                        u2.z(R.string.view_file_action_text, new View.OnClickListener() { // from class: ddte
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
                        a.y(new dhln() { // from class: ddtd
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                OnDeviceSettingsChimeraActivity onDeviceSettingsChimeraActivity2 = OnDeviceSettingsChimeraActivity.this;
                                onDeviceSettingsChimeraActivity2.n(onDeviceSettingsChimeraActivity2.getString(R.string.download_failed_text));
                                onDeviceSettingsChimeraActivity2.p.e("EdcExportFailure");
                            }
                        });
                    }
                });
                if (fure.c()) {
                    ddvs ddvsVar = new ddvs();
                    this.o = ddvsVar;
                    ddvsVar.a = this;
                    bp bpVar = new bp(getSupportFragmentManager());
                    bpVar.v(this.o, "toolbar");
                    bpVar.a();
                    addMenuProvider(this.o);
                }
                List h = auqx.h(this, getPackageName());
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
