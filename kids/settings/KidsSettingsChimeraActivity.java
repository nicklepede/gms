package com.google.android.gms.kids.settings;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.kids.settings.KidsSettingsChimeraActivity;
import defpackage.abt;
import defpackage.acl;
import defpackage.asej;
import defpackage.asoe;
import defpackage.asot;
import defpackage.bpvn;
import defpackage.brbv;
import defpackage.btsx;
import defpackage.edeq;
import defpackage.edgl;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.eiig;
import defpackage.eits;
import defpackage.eupa;
import defpackage.eupc;
import defpackage.eurb;
import defpackage.eurf;
import defpackage.eurh;
import defpackage.jrh;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class KidsSettingsChimeraActivity extends qet {
    public bpvn l;
    private DevicePolicyManager o;
    private static final edjt m = new edjt(R.style.SudThemeGlifV3_DayNight, true);
    public static final asot j = asot.b("KidsSettingsChimeraActivity", asej.KIDS);
    static final ComponentName k = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
    private static final eits n = eits.p(eurh.GOLD_FROM_FL, eurf.FAMILY_LINK, eurh.GOLD_FROM_SUNSHINE, eurf.SUNSHINE, eurh.GOLD_FROM_PLAY_STORE_FAMILY_HOME, eurf.PLAY_STORE_FAMILY_HOME, eurh.GOLD_FROM_FI, eurf.GOOGLE_FI, eurh.GOOGLE_SETTINGS_FLOW, eurf.GOOGLE_SETTINGS);

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        eurh eurhVar;
        super.onCreate(bundle);
        Object systemService = getSystemService("device_policy");
        eiig.x(systemService);
        this.o = (DevicePolicyManager) systemService;
        setTheme(m.a(getIntent()));
        int i = edjs.a;
        if (edeq.w(this)) {
            setTheme(edjs.a(this));
        }
        this.l = (bpvn) new jrh(this).a(bpvn.class);
        if ("com.google.android.gms.kids.settings.GOLD_FROM_FL".equals(getIntent().getAction())) {
            eurhVar = eurh.GOLD_FROM_FL;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_SUNSHINE".equals(getIntent().getAction())) {
            eurhVar = eurh.GOLD_FROM_SUNSHINE;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_FI".equals(getIntent().getAction())) {
            eurhVar = eurh.GOLD_FROM_FI;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_PLAY_STORE".equals(getIntent().getAction())) {
            eurhVar = eurh.UNKNOWN_FLOW_TYPE;
            String stringExtra = getIntent().getStringExtra("play_store_entry_point");
            if (stringExtra != null && stringExtra.hashCode() == -848597455 && stringExtra.equals("play_store_family_home")) {
                eurhVar = eurh.GOLD_FROM_PLAY_STORE_FAMILY_HOME;
            }
        } else if (getIntent().hasCategory("com.android.settings.suggested.category.PARENTAL_CONTROLS")) {
            eurhVar = eurh.SETUP_WIZARD_FLOW;
        } else {
            ComponentName component = getIntent().getComponent();
            eurhVar = (component == null || !"com.google.android.gms.kids.settings.KidsSettingsActivity".equals(component.getClassName())) ? eurh.SETTINGS_FLOW : eurh.GOOGLE_SETTINGS_FLOW;
        }
        if (bundle != null) {
            bpvn bpvnVar = this.l;
            String string = bundle.getString("session-id");
            if (string != null) {
                bpvnVar.a = string;
                return;
            }
            return;
        }
        DevicePolicyManager devicePolicyManager = this.o;
        ComponentName componentName = k;
        if ((!devicePolicyManager.isAdminActive(componentName) || !this.o.isProfileOwnerApp(componentName.getPackageName())) && !this.o.isProfileOwnerApp("com.google.android.gms.supervision")) {
            if (eurhVar.ordinal() == 0) {
                finish();
                return;
            }
            registerForActivityResult(new acl(), new abt() { // from class: bpvm
                @Override // defpackage.abt
                public final void jq(Object obj) {
                    if (((ActivityResult) obj).a == -1) {
                        ((ejhf) KidsSettingsChimeraActivity.j.h()).x("Intent to DeviceSupervisionOptInChimeraActivity was launched.");
                    } else {
                        ((ejhf) KidsSettingsChimeraActivity.j.i()).x("Intent to DeviceSupervisionOptInChimeraActivity failed.");
                    }
                }
            }).b(new Intent(getIntent()).setClassName("com.google.android.gms", "com.google.android.gms.kids.settings.DeviceSupervisionOptInActivity").putExtra("entry_point", ((eurf) n.getOrDefault(eurhVar, eurf.UNKNOWN_ENTRY_POINT)).h));
            setResult(-1);
            finish();
            return;
        }
        eurb eurbVar = eurb.CHILD_DETERMINED;
        brbv l = btsx.v().l(eupa.a);
        l.c = Integer.valueOf(eurbVar.en);
        l.a();
        if (getPackageManager().queryIntentActivities(new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS"), 0).isEmpty() || asoe.d(this)) {
            bpvn bpvnVar2 = this.l;
            Intent intent = getIntent();
            Intent putExtra = new Intent("com.google.android.gms.kids.CONTINUE_FROM_SETTINGS").setComponent(new ComponentName(bpvnVar2.a().getPackageName(), "com.google.android.gms.kids.KidSetupActivity")).putExtra("session_id", bpvnVar2.a);
            edgl.a(intent, putExtra);
            if (!putExtra.hasExtra("theme")) {
                putExtra.putExtra("theme", "glif_v3_light");
            }
            startActivity(putExtra);
        } else {
            ComponentName profileOwner = this.o.getProfileOwner();
            eiig.x(profileOwner);
            Intent component2 = new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS").setComponent(new ComponentName(profileOwner.getPackageName(), "com.google.android.gms.kids.TransparencyActivity"));
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                component2.putExtras(extras);
            }
            component2.putExtra("caller", eupc.ACCOUNT_SETTINGS);
            startActivityForResult(component2, 0);
        }
        finish();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session-id", this.l.a);
    }
}
