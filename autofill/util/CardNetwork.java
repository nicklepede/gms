package com.google.android.gms.autofill.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.adtb;
import defpackage.adtc;
import defpackage.aher;
import defpackage.fldt;
import defpackage.flek;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class CardNetwork implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aher();

    public static adtc d(Context context, int i) {
        Integer f = f(i);
        return flek.u() ? adtc.d(f.intValue(), e(context, i), adtb.NETWORK) : adtc.c("com.google.android.gms", f.intValue(), e(context, i));
    }

    public static CharSequence e(Context context, int i) {
        if (i == 1) {
            return "Amex";
        }
        if (i == 2) {
            return "DinersClub";
        }
        if (i == 3) {
            return "Discover";
        }
        if (i == 4) {
            return "JCB";
        }
        if (i == 5) {
            return "MasterCard";
        }
        if (i == 13) {
            return "Maestro";
        }
        if (i == 14) {
            return "UnionPay";
        }
        if (i != 23) {
            switch (i) {
                case 7:
                    return "Solo";
                case 8:
                    return "Visa";
                case 9:
                    return "Elo";
                case 10:
                    return "Interac";
                case 11:
                    return "EFTPOS";
            }
        }
        if (fldt.y()) {
            return "Verve";
        }
        return context.getText(R.string.common_card);
    }

    public static Integer f(int i) {
        if (i == 1) {
            return 2131234014;
        }
        if (i == 2) {
            return 2131234016;
        }
        if (i == 3) {
            return 2131234017;
        }
        if (i == 4) {
            return 2131234020;
        }
        if (i == 5) {
            return 2131234021;
        }
        if (i == 8) {
            return 2131234023;
        }
        if (i != 9) {
            return (i == 23 && fldt.y()) ? 2131234022 : 2131234019;
        }
        return 2131234018;
    }

    public abstract int a();

    public abstract String b();

    public Pattern c() {
        try {
            return Pattern.compile(b() + ".*");
        } catch (PatternSyntaxException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeString(b());
    }
}
