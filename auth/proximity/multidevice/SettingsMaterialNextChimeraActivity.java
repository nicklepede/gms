package com.google.android.gms.auth.proximity.multidevice;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextChimeraActivity;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.acqc;
import defpackage.acqe;
import defpackage.acrk;
import defpackage.acrl;
import defpackage.acro;
import defpackage.acrp;
import defpackage.acrq;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.entc;
import defpackage.esjn;
import defpackage.fc;
import defpackage.iln;
import defpackage.qgg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SettingsMaterialNextChimeraActivity extends qgg implements fc, acrp, acro {
    public static final asot j = acqc.a("BetterTogetherSettings");
    FutureTask k;
    public Account l;
    FeatureEnabledReceiver m;
    public acrq n;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FeatureEnabledReceiver extends TracingBroadcastReceiver {
        public FeatureEnabledReceiver() {
            super("auth_proximity");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            SettingsMaterialNextChimeraActivity settingsMaterialNextChimeraActivity;
            Account account;
            if ("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction()) && (account = (settingsMaterialNextChimeraActivity = SettingsMaterialNextChimeraActivity.this).l) != null) {
                String str = account.name;
                String stringExtra = intent.getStringExtra("EXTRA_FEATURE_NAME");
                if ((esjn.BETTER_TOGETHER_HOST.name().equals(stringExtra) || esjn.EXO_HOST.name().equals(stringExtra) || esjn.WIFI_SYNC_HOST.name().equals(stringExtra) || esjn.PHONE_HUB_CAMERA_ROLL_HOST.name().equals(stringExtra) || esjn.PHONE_HUB_HOST.name().equals(stringExtra)) && str.equals(intent.getStringExtra("EXTRA_ACCOUNT_NAME"))) {
                    settingsMaterialNextChimeraActivity.n.a(new Account(str, "com.google"), settingsMaterialNextChimeraActivity);
                }
            }
        }
    }

    private final boolean f() {
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("FROM_PHONE_HUB_NOTIFICATION", false);
    }

    @Override // defpackage.fc
    public final void a(String str, Bundle bundle) {
        if (!str.equals("SETTINGS_ACCOUNT_SPINNER_REQUEST")) {
            ((ejhf) j.j()).B("Unknown fragment result key received: %s", str);
            return;
        }
        String string = bundle.getString("ACCOUNT_NAME");
        if (string == null) {
            ((ejhf) j.j()).x("Account spinner fragment result is missing an account name param");
            return;
        }
        this.l = new Account(string, "com.google");
        getSupportFragmentManager().t("SETTINGS_ACCOUNT_SPINNER_REQUEST");
        this.n.a(this.l, this);
    }

    @Override // defpackage.acro
    public final void b(final Bundle bundle) {
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: acry
            @Override // java.lang.Runnable
            public final void run() {
                SettingsMaterialNextChimeraActivity settingsMaterialNextChimeraActivity = SettingsMaterialNextChimeraActivity.this;
                if (settingsMaterialNextChimeraActivity.isDestroyed()) {
                    return;
                }
                List h = asnd.h(settingsMaterialNextChimeraActivity, settingsMaterialNextChimeraActivity.getPackageName());
                ArrayList<String> arrayList = new ArrayList<>(h.size());
                Iterator it = h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Account) it.next()).name);
                }
                Bundle bundle2 = bundle;
                bundle2.putStringArrayList("AVAILABLE_GOOGLE_ACCOUNTS", arrayList);
                acsl acslVar = new acsl();
                acslVar.setArguments(bundle2);
                bp bpVar = new bp(settingsMaterialNextChimeraActivity.getSupportFragmentManager());
                bpVar.F(R.id.content_frame, acslVar);
                bpVar.b();
            }
        }, null);
        this.k = futureTask;
        runOnUiThread(futureTask);
    }

    @Override // defpackage.acrp
    public final void c(final Account account) {
        runOnUiThread(new Runnable() { // from class: acsa
            @Override // java.lang.Runnable
            public final void run() {
                Account account2;
                SettingsMaterialNextChimeraActivity settingsMaterialNextChimeraActivity = SettingsMaterialNextChimeraActivity.this;
                if (settingsMaterialNextChimeraActivity.isDestroyed()) {
                    return;
                }
                Account account3 = account;
                if ((account3 != null && (account2 = settingsMaterialNextChimeraActivity.l) != null && account3.equals(account2)) || (account3 == null && settingsMaterialNextChimeraActivity.l == null)) {
                    ((ejhf) SettingsMaterialNextChimeraActivity.j.h()).x("Selected account matched initial account check, skipping processing");
                } else {
                    if (account3 == null) {
                        ((ejhf) SettingsMaterialNextChimeraActivity.j.h()).x("Initial account check did not find any with BeTo enabled, skipping processing");
                        return;
                    }
                    ((ejhf) SettingsMaterialNextChimeraActivity.j.h()).x("Selected account was updated from initial account check");
                    settingsMaterialNextChimeraActivity.l = account3;
                    settingsMaterialNextChimeraActivity.n.a(account3, settingsMaterialNextChimeraActivity);
                }
            }
        });
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = new acrq(this);
        setTitle(getString(R.string.phone_hub_permission_opt_in_title));
        getSupportFragmentManager().ac("SETTINGS_ACCOUNT_SPINNER_REQUEST", this, this);
        List h = asnd.h(this, getPackageName());
        if (!h.isEmpty()) {
            this.l = (Account) h.get(0);
        }
        this.n.a(this.l, new acro() { // from class: acrz
            @Override // defpackage.acro
            public final void b(Bundle bundle2) {
                bundle2.putBoolean("EXO_FORCE_UPDATE", true);
                SettingsMaterialNextChimeraActivity.this.b(bundle2);
            }
        });
        acrq acrqVar = this.n;
        acrqVar.c = entc.a(new asmf(1, 9)).submit(new acrk(acrqVar));
        ensj.t(acrqVar.c, new acrl(acrqVar, this), new asmf(1, 9));
        if (f()) {
            new acqe().H();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        FeatureEnabledReceiver featureEnabledReceiver = this.m;
        if (featureEnabledReceiver != null) {
            unregisterReceiver(featureEnabledReceiver);
            this.m = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = getIntent();
        if ((intent == null || !intent.getBooleanExtra("FROM_BETTER_TOGETHER_NOTIFICATION", false)) && !f()) {
            onBackPressed();
            finish();
            return true;
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.android.settings.ADVANCED_CONNECTED_DEVICE_SETTINGS");
        intent2.addFlags(553648128);
        try {
            startActivity(intent2);
        } catch (ActivityNotFoundException unused) {
            onBackPressed();
        }
        finish();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onRestart() {
        super.onRestart();
        ((ejhf) j.h()).x("Refresh UI due to the activity is restarted.");
        this.n.a(this.l, this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        FeatureEnabledReceiver featureEnabledReceiver = new FeatureEnabledReceiver();
        this.m = featureEnabledReceiver;
        iln.b(this, featureEnabledReceiver, new IntentFilter("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE"), 2);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        super.onStop();
        FeatureEnabledReceiver featureEnabledReceiver = this.m;
        if (featureEnabledReceiver != null) {
            unregisterReceiver(featureEnabledReceiver);
            this.m = null;
        }
    }
}
