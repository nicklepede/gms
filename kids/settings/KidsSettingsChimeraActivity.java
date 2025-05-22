package com.google.android.gms.kids.settings;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.kids.settings.KidsSettingsChimeraActivity;
import defpackage.aby;
import defpackage.acq;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.bsdd;
import defpackage.btjm;
import defpackage.bwaz;
import defpackage.efrl;
import defpackage.eftg;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ekvl;
import defpackage.elgx;
import defpackage.exet;
import defpackage.exev;
import defpackage.exgu;
import defpackage.exgy;
import defpackage.exha;
import defpackage.fsck;
import defpackage.iri;
import defpackage.jxw;
import defpackage.rxx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class KidsSettingsChimeraActivity extends rxx {
    public bsdd l;
    private DevicePolicyManager o;
    private static final efwo m = new efwo(R.style.SudThemeGlifV3_DayNight, true);
    public static final ausn j = ausn.b("KidsSettingsChimeraActivity", auid.KIDS);
    static final ComponentName k = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
    private static final elgx n = elgx.q(exha.GOLD_FROM_FL, exgy.FAMILY_LINK, exha.GOLD_FROM_SUNSHINE, exgy.SUNSHINE, exha.GOLD_FROM_PLAY_STORE_FAMILY_HOME, exgy.PLAY_STORE_FAMILY_HOME, exha.GOLD_FROM_FI, exgy.GOOGLE_FI, exha.GOOGLE_SETTINGS_FLOW, exgy.GOOGLE_SETTINGS, exha.SUPERVISION_UPGRADE_FLOW, exgy.SUPERVISION_UPGRADE);

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        exha exhaVar;
        super.onCreate(bundle);
        Object systemService = getSystemService("device_policy");
        ekvl.y(systemService);
        this.o = (DevicePolicyManager) systemService;
        setTheme(m.a(getIntent()));
        int i = efwn.a;
        if (efrl.w(this)) {
            setTheme(efwn.a(this));
        }
        this.l = (bsdd) new jxw(this).a(bsdd.class);
        if ("com.google.android.gms.kids.settings.GOLD_FROM_FL".equals(getIntent().getAction())) {
            exhaVar = exha.GOLD_FROM_FL;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_SUNSHINE".equals(getIntent().getAction())) {
            exhaVar = exha.GOLD_FROM_SUNSHINE;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_FI".equals(getIntent().getAction())) {
            exhaVar = exha.GOLD_FROM_FI;
        } else if (Objects.equals(getIntent().getAction(), "android.settings.SUPERVISION_UPGRADE")) {
            if (fsck.h()) {
                int i2 = iri.a;
            }
            exhaVar = exha.UNKNOWN_FLOW_TYPE;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_PLAY_STORE".equals(getIntent().getAction())) {
            exhaVar = exha.UNKNOWN_FLOW_TYPE;
            String stringExtra = getIntent().getStringExtra("play_store_entry_point");
            if (stringExtra != null && stringExtra.hashCode() == -848597455 && stringExtra.equals("play_store_family_home")) {
                exhaVar = exha.GOLD_FROM_PLAY_STORE_FAMILY_HOME;
            }
        } else if (getIntent().hasCategory("com.android.settings.suggested.category.PARENTAL_CONTROLS")) {
            exhaVar = exha.SETUP_WIZARD_FLOW;
        } else {
            ComponentName component = getIntent().getComponent();
            exhaVar = (component == null || !"com.google.android.gms.kids.settings.KidsSettingsActivity".equals(component.getClassName())) ? exha.SETTINGS_FLOW : exha.GOOGLE_SETTINGS_FLOW;
        }
        if (bundle != null) {
            bsdd bsddVar = this.l;
            String string = bundle.getString("session-id");
            if (string != null) {
                bsddVar.a = string;
                return;
            }
            return;
        }
        DevicePolicyManager devicePolicyManager = this.o;
        ComponentName componentName = k;
        if ((!devicePolicyManager.isAdminActive(componentName) || !this.o.isProfileOwnerApp(componentName.getPackageName())) && !this.o.isProfileOwnerApp("com.google.android.gms.supervision")) {
            if (exhaVar.ordinal() == 0) {
                finish();
                return;
            }
            registerForActivityResult(new acq(), new aby() { // from class: bsdc
                @Override // defpackage.aby
                public final void jF(Object obj) {
                    if (((ActivityResult) obj).a == -1) {
                        ((eluo) KidsSettingsChimeraActivity.j.h()).x("Intent to DeviceSupervisionOptInChimeraActivity was launched.");
                    } else {
                        ((eluo) KidsSettingsChimeraActivity.j.i()).x("Intent to DeviceSupervisionOptInChimeraActivity failed.");
                    }
                }
            }).b(new Intent(getIntent()).setClassName("com.google.android.gms", "com.google.android.gms.kids.settings.DeviceSupervisionOptInActivity").putExtra("entry_point", ((exgy) n.getOrDefault(exhaVar, exgy.UNKNOWN_ENTRY_POINT)).i));
            setResult(-1);
            finish();
            return;
        }
        exgu exguVar = exgu.CHILD_DETERMINED;
        btjm l = bwaz.v().l(exet.a);
        l.c = Integer.valueOf(exguVar.en);
        l.a();
        if (getPackageManager().queryIntentActivities(new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS"), 0).isEmpty() || aury.d(this)) {
            bsdd bsddVar2 = this.l;
            Intent intent = getIntent();
            Intent putExtra = new Intent("com.google.android.gms.kids.CONTINUE_FROM_SETTINGS").setComponent(new ComponentName(bsddVar2.a().getPackageName(), "com.google.android.gms.kids.KidSetupActivity")).putExtra("session_id", bsddVar2.a);
            eftg.a(intent, putExtra);
            if (!putExtra.hasExtra("theme")) {
                putExtra.putExtra("theme", "glif_v3_light");
            }
            startActivity(putExtra);
        } else {
            ComponentName profileOwner = this.o.getProfileOwner();
            ekvl.y(profileOwner);
            Intent component2 = new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS").setComponent(new ComponentName(profileOwner.getPackageName(), "com.google.android.gms.kids.TransparencyActivity"));
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                component2.putExtras(extras);
            }
            component2.putExtra("caller", exev.ACCOUNT_SETTINGS);
            startActivityForResult(component2, 0);
        }
        finish();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session-id", this.l.a);
    }
}
