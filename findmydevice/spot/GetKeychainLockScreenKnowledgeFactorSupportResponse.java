package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetKeychainLockScreenKnowledgeFactorSupportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexa();
    public boolean a;
    public boolean b;
    public Boolean c;
    public Boolean d;

    public GetKeychainLockScreenKnowledgeFactorSupportResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetKeychainLockScreenKnowledgeFactorSupportResponse) {
            GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse = (GetKeychainLockScreenKnowledgeFactorSupportResponse) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.b)) && atyq.b(this.c, getKeychainLockScreenKnowledgeFactorSupportResponse.c) && atyq.b(this.d, getKeychainLockScreenKnowledgeFactorSupportResponse.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.z(parcel, 3, this.c);
        atzr.z(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportResponse(boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = z2;
        this.c = bool;
        this.d = bool2;
    }
}
