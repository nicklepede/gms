package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.dhoz;
import defpackage.dhpb;
import defpackage.fijq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public final boolean b;
    public final boolean c;
    private final List d;
    public static final ConsentInformation a = new ConsentInformation(null, false, false);
    public static final Parcelable.Creator CREATOR = new dhpb();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dhoz();
        public final String a;
        public final byte[] b;
        private final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public static AccountConsentInformation a(String str, fijq fijqVar, List list) {
            arwm.t(fijqVar, "Account Consents proto cannot be null");
            return new AccountConsentInformation(str, fijqVar.r(), list);
        }

        public final List b() {
            return new ArrayList(this.c);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return arwb.b(this.a, accountConsentInformation.a) && arwb.b(this.b, accountConsentInformation.b) && arwb.b(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.i(parcel, 2, this.b, false);
            arxc.E(parcel, 3, b());
            arxc.c(parcel, a);
        }
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.d = list == null ? new ArrayList(0) : new ArrayList(list);
        this.b = z;
        this.c = z2;
    }

    public final List a() {
        return new ArrayList(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return arwb.b(this.d, consentInformation.d) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(consentInformation.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, a(), false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a2);
    }
}
