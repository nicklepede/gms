package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetKeychainLockScreenKnowledgeFactorSupportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvo();
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
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.a)) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.b)) && arwb.b(this.c, getKeychainLockScreenKnowledgeFactorSupportResponse.c) && arwb.b(this.d, getKeychainLockScreenKnowledgeFactorSupportResponse.d)) {
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
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.z(parcel, 3, this.c);
        arxc.z(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportResponse(boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = z2;
        this.c = bool;
        this.d = bool2;
    }
}
