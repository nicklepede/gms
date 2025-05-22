package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.settingslib.widget.BannerMessagePreference;
import com.google.android.gms.R;
import defpackage.dagx;
import defpackage.fxxm;
import defpackage.fyab;
import defpackage.iwj;
import defpackage.mfa;
import defpackage.ozs;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingBannerMessagePreference extends BannerMessagePreference {
    public SafeBrowsingBannerMessagePreference(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    @Override // com.android.settingslib.widget.BannerMessagePreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        LinearLayout linearLayout;
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        Context context = this.j;
        fxxm.e(context, "getContext(...)");
        if (ozs.a(context)) {
            View D = mfaVar.D(R.id.banner_icon);
            ImageView imageView = D instanceof ImageView ? (ImageView) D : null;
            if (imageView != null) {
                int i = ((BannerMessagePreference) this).b;
                if (i == 0) {
                    throw null;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(context.getColor(i), PorterDuff.Mode.SRC_IN));
            }
        }
        mfaVar.v = false;
        mfaVar.w = true;
        View view = mfaVar.a;
        LinearLayout linearLayout2 = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setPadding(dagx.a(this, 16), dagx.a(this, 4), linearLayout2.getPaddingRight(), dagx.a(this, 28));
        Object e = fyab.e(new iwj(linearLayout2));
        LinearLayout linearLayout3 = e instanceof LinearLayout ? (LinearLayout) e : null;
        if (linearLayout3 != null) {
            Iterator a = new iwj(linearLayout3).a();
            while (true) {
                if (!a.hasNext()) {
                    linearLayout = 0;
                    break;
                } else {
                    linearLayout = a.next();
                    if (((View) linearLayout) instanceof LinearLayout) {
                        break;
                    }
                }
            }
            LinearLayout linearLayout4 = linearLayout instanceof LinearLayout ? linearLayout : null;
            if (linearLayout4 != null) {
                linearLayout4.setPadding(dagx.a(this, 8), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
            }
        }
    }

    public SafeBrowsingBannerMessagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeBrowsingBannerMessagePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SafeBrowsingBannerMessagePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
