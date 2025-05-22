package com.google.android.gms.significantplaces.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.StalePlacesNoticeChimeraActivity;
import defpackage.detc;
import defpackage.fxxm;
import defpackage.ip;
import defpackage.iq;
import defpackage.ite;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StalePlacesNoticeChimeraActivity extends detc {
    private final int j = R.style.StalePlacesNoticeMaterialDialogTheme;
    private final boolean k = true;

    @Override // defpackage.detc
    public final int a() {
        return this.j;
    }

    @Override // defpackage.detc
    public final iq b(ip ipVar) {
        int intExtra = getIntent().getIntExtra("num_to_remove", 0);
        Resources resources = getResources();
        Integer valueOf = Integer.valueOf(intExtra);
        ip title = ipVar.setTitle(resources.getQuantityString(R.plurals.significant_places_stale_places_notice_title, intExtra, valueOf));
        String quantityString = getResources().getQuantityString(R.plurals.significant_places_stale_places_notice_message, intExtra, valueOf);
        fxxm.e(quantityString, "getQuantityString(...)");
        String string = getString(R.string.significant_places_stale_places_learn_more, new Object[]{getString(R.string.trusted_places_learn_more_url)});
        fxxm.e(string, "getString(...)");
        Spanned a = ite.a(string, 63);
        fxxm.e(a, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) a);
        title.p(spannableStringBuilder);
        title.setPositiveButton(R.string.significant_places_stale_places_got_it, new DialogInterface.OnClickListener() { // from class: devj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = dete.a;
                dete.b(StalePlacesNoticeChimeraActivity.this);
            }
        });
        title.setNegativeButton(R.string.significant_places_stale_places_add_back, new DialogInterface.OnClickListener() { // from class: devk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = dete.a;
                dete.a();
                StalePlacesNoticeChimeraActivity stalePlacesNoticeChimeraActivity = StalePlacesNoticeChimeraActivity.this;
                if (fuvk.f() && ozs.a(stalePlacesNoticeChimeraActivity)) {
                    stalePlacesNoticeChimeraActivity.startActivity(new Intent().setClassName(stalePlacesNoticeChimeraActivity, "com.google.android.gms.significantplaces.settings.SuggestionListToolbarActivity"));
                } else {
                    stalePlacesNoticeChimeraActivity.startActivity(new Intent().setClassName(stalePlacesNoticeChimeraActivity, "com.google.android.gms.significantplaces.settings.SuggestionListActivity"));
                }
                dete.b(stalePlacesNoticeChimeraActivity);
            }
        });
        title.n(R.drawable.gs_android_security_privacy_vd_theme_24);
        return title.create();
    }

    @Override // defpackage.detc
    public final boolean c() {
        return this.k;
    }
}
