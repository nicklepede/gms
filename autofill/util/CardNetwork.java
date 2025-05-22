package com.google.android.gms.autofill.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.afti;
import defpackage.aftj;
import defpackage.ajfh;
import defpackage.fnvd;
import defpackage.fnvu;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class CardNetwork implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajfh();

    public static aftj d(Context context, int i) {
        Integer f = f(i);
        return fnvu.w() ? aftj.d(f.intValue(), e(context, i), afti.NETWORK) : aftj.c("com.google.android.gms", f.intValue(), e(context, i));
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
        if (fnvd.x()) {
            return "Verve";
        }
        return context.getText(R.string.common_card);
    }

    public static Integer f(int i) {
        if (i == 1) {
            return 2131234086;
        }
        if (i == 2) {
            return 2131234088;
        }
        if (i == 3) {
            return 2131234089;
        }
        if (i == 4) {
            return 2131234092;
        }
        if (i == 5) {
            return 2131234093;
        }
        if (i == 8) {
            return 2131234095;
        }
        if (i != 9) {
            return (i == 23 && fnvd.x()) ? 2131234094 : 2131234091;
        }
        return 2131234090;
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
