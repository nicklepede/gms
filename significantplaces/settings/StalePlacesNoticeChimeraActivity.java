package com.google.android.gms.significantplaces.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.StalePlacesNoticeChimeraActivity;
import defpackage.dciw;
import defpackage.fvbo;
import defpackage.ip;
import defpackage.iq;
import defpackage.iro;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class StalePlacesNoticeChimeraActivity extends dciw {
    private final int j = R.style.StalePlacesNoticeMaterialDialogTheme;
    private final boolean k = true;

    @Override // defpackage.dciw
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dciw
    public final iq b(ip ipVar) {
        int intExtra = getIntent().getIntExtra("num_to_remove", 0);
        Resources resources = getResources();
        Integer valueOf = Integer.valueOf(intExtra);
        ip title = ipVar.setTitle(resources.getQuantityString(R.plurals.significant_places_stale_places_notice_title, intExtra, valueOf));
        String quantityString = getResources().getQuantityString(R.plurals.significant_places_stale_places_notice_message, intExtra, valueOf);
        fvbo.e(quantityString, "getQuantityString(...)");
        String string = getString(R.string.significant_places_stale_places_learn_more, new Object[]{getString(R.string.trusted_places_learn_more_url)});
        fvbo.e(string, "getString(...)");
        Spanned a = iro.a(string, 63);
        fvbo.e(a, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) a);
        title.n(spannableStringBuilder);
        ip positiveButton = title.setPositiveButton(R.string.significant_places_stale_places_got_it, new DialogInterface.OnClickListener() { // from class: dckp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = dciy.a;
                dciy.b(StalePlacesNoticeChimeraActivity.this);
            }
        });
        positiveButton.setNegativeButton(R.string.significant_places_stale_places_add_back, new DialogInterface.OnClickListener() { // from class: dckq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = dciy.a;
                dciy.a();
                Intent intent = new Intent();
                StalePlacesNoticeChimeraActivity stalePlacesNoticeChimeraActivity = StalePlacesNoticeChimeraActivity.this;
                stalePlacesNoticeChimeraActivity.startActivity(intent.setClassName(stalePlacesNoticeChimeraActivity, "com.google.android.gms.significantplaces.settings.SuggestionListActivity"));
                dciy.b(stalePlacesNoticeChimeraActivity);
            }
        });
        positiveButton.l(R.drawable.gs_android_security_privacy_vd_theme_24);
        return positiveButton.create();
    }

    @Override // defpackage.dciw
    public final boolean c() {
        return this.k;
    }
}
