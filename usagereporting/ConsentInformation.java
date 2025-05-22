package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dkaf;
import defpackage.dkah;
import defpackage.fkzn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public final boolean b;
    public final boolean c;
    private final List d;
    public static final ConsentInformation a = new ConsentInformation(null, false, false);
    public static final Parcelable.Creator CREATOR = new dkah();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkaf();
        public final String a;
        public final byte[] b;
        private final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public static AccountConsentInformation a(String str, fkzn fkznVar, List list) {
            atzb.t(fkznVar, "Account Consents proto cannot be null");
            return new AccountConsentInformation(str, fkznVar.r(), list);
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
            return atyq.b(this.a, accountConsentInformation.a) && atyq.b(this.b, accountConsentInformation.b) && atyq.b(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.i(parcel, 2, this.b, false);
            atzr.E(parcel, 3, b());
            atzr.c(parcel, a);
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
        return atyq.b(this.d, consentInformation.d) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(consentInformation.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, a(), false);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a2);
    }
}
