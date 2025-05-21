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
import defpackage.cxxa;
import defpackage.fvbo;
import defpackage.fved;
import defpackage.iut;
import defpackage.kmp;
import defpackage.ngr;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
    public final void a(kmp kmpVar) {
        LinearLayout linearLayout;
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        Context context = this.j;
        fvbo.e(context, "getContext(...)");
        if (ngr.a(context)) {
            View D = kmpVar.D(R.id.banner_icon);
            ImageView imageView = D instanceof ImageView ? (ImageView) D : null;
            if (imageView != null) {
                int i = ((BannerMessagePreference) this).b;
                if (i == 0) {
                    throw null;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(context.getColor(i), PorterDuff.Mode.SRC_IN));
            }
        }
        kmpVar.v = false;
        kmpVar.w = true;
        View view = kmpVar.a;
        LinearLayout linearLayout2 = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setPadding(cxxa.a(this, 16), cxxa.a(this, 4), linearLayout2.getPaddingRight(), cxxa.a(this, 28));
        Object e = fved.e(new iut(linearLayout2));
        LinearLayout linearLayout3 = e instanceof LinearLayout ? (LinearLayout) e : null;
        if (linearLayout3 != null) {
            Iterator a = new iut(linearLayout3).a();
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
                linearLayout4.setPadding(cxxa.a(this, 8), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
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
