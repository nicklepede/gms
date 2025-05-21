package com.google.android.gms.mobiledataplan.ui;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asej;
import defpackage.asno;
import defpackage.asot;
import defpackage.ceau;
import defpackage.ceqf;
import defpackage.ceqi;
import defpackage.fqhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SettingsIntentOperation extends anxy {
    static final int[] a = {R.string.mdp_keyword_mobile, R.string.pmtcs_generic, R.string.plan, R.string.mdp_keyword_network, R.string.mdp_keyword_internet, R.string.mdp_keyword_cell, R.string.mdp_keyword_cellular, R.string.mdp_keyword_wireless, R.string.mdp_keyword_connect, R.string.mdp_keyword_limit, R.string.mdp_keyword_limited, R.string.mdp_keyword_unlimited, R.string.mdp_keyword_prepaid, R.string.mdp_keyword_postpaid, R.string.mdp_keyword_carrier, R.string.mdp_keyword_usage, R.string.common_kilobyte_short, R.string.common_megabyte_short, R.string.common_gigabyte_short, R.string.mdp_keyword_kilobyte, R.string.mdp_keyword_megabyte, R.string.mdp_keyword_gigabyte, R.string.mdp_keyword_quota, R.string.mdp_keyword_balance, R.string.mdp_keyword_sms, R.string.mdp_keyword_call, R.string.mdp_keyword_4g, R.string.mdp_keyword_3g, R.string.mdp_keyword_2g, R.string.mdp_keyword_lte, R.string.mdp_keyword_connection};
    private static final asot b = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        boolean i = ceqi.i(this);
        boolean S = fqhf.S();
        b.f(ceqi.h()).S("Creating MobileDataPlan Settings item, show UI: %b, disable for non eSIM: %b", S, i);
        if (!S || i) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"), 0, true != fqhf.a.a().aj() ? R.string.mobile_data_plan : R.string.mobile_data_plan_settings_item_title, aojj.MOBILE_DATA_PLAN_ITEM, asno.b(this));
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
        String r = ceau.c().r(ceqf.g(this));
        if (r != null) {
            googleSettingsItem.a(r);
        }
        return googleSettingsItem;
    }
}
