package com.google.android.gms.mobiledataplan.ui;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auid;
import defpackage.auri;
import defpackage.ausn;
import defpackage.cgkb;
import defpackage.cgzm;
import defpackage.cgzp;
import defpackage.ftax;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SettingsIntentOperation extends apzq {
    static final int[] a = {R.string.mdp_keyword_mobile, R.string.pmtcs_generic, R.string.plan, R.string.mdp_keyword_network, R.string.mdp_keyword_internet, R.string.mdp_keyword_cell, R.string.mdp_keyword_cellular, R.string.mdp_keyword_wireless, R.string.mdp_keyword_connect, R.string.mdp_keyword_limit, R.string.mdp_keyword_limited, R.string.mdp_keyword_unlimited, R.string.mdp_keyword_prepaid, R.string.mdp_keyword_postpaid, R.string.mdp_keyword_carrier, R.string.mdp_keyword_usage, R.string.common_kilobyte_short, R.string.common_megabyte_short, R.string.common_gigabyte_short, R.string.mdp_keyword_kilobyte, R.string.mdp_keyword_megabyte, R.string.mdp_keyword_gigabyte, R.string.mdp_keyword_quota, R.string.mdp_keyword_balance, R.string.mdp_keyword_sms, R.string.mdp_keyword_call, R.string.mdp_keyword_4g, R.string.mdp_keyword_3g, R.string.mdp_keyword_2g, R.string.mdp_keyword_lte, R.string.mdp_keyword_connection};
    private static final ausn b = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        boolean i = cgzp.i(this);
        boolean Q = ftax.Q();
        b.f(cgzp.h()).S("Creating MobileDataPlan Settings item, show UI: %b, disable for non eSIM: %b", Q, i);
        if (!Q || i) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"), 0, true != ftax.a.lK().ag() ? R.string.mobile_data_plan : R.string.mobile_data_plan_settings_item_title, aqlc.MOBILE_DATA_PLAN_ITEM, auri.b(this));
        googleSettingsItem.e = false;
        googleSettingsItem.g = true;
        googleSettingsItem.l = false;
        googleSettingsItem.p = getString(R.string.mobile_data_plan_page_description);
        googleSettingsItem.j = true;
        googleSettingsItem.m = "MobileDataPlanSettingsActivity";
        googleSettingsItem.l = true;
        int[] iArr = a;
        for (int i2 = 0; i2 < 31; i2++) {
            googleSettingsItem.a(getString(iArr[i2]));
        }
        String r = cgkb.c().r(cgzm.g(this));
        if (r != null) {
            googleSettingsItem.a(r);
        }
        return googleSettingsItem;
    }
}
