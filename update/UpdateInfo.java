package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhee;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpdateInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhee();
    public final boolean a;
    private final String b;
    private final String c;
    private final String d;

    public UpdateInfo(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        if (this.a) {
            return this.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) obj;
        return this.a == updateInfo.a && arwb.b(this.b, updateInfo.b) && arwb.b(this.c, updateInfo.c) && arwb.b(this.d, updateInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("metadataAvailable", Boolean.valueOf(this.a), arrayList);
        arwa.b("targetSdkLevel", this.b, arrayList);
        arwa.b("targetSecurityPatchLevel", this.c, arrayList);
        arwa.b("targetBuildFingerprint", this.d, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.v(parcel, 2, a(), false);
        arxc.v(parcel, 3, z ? this.c : null, false);
        arxc.v(parcel, 4, z ? this.d : null, false);
        arxc.c(parcel, a);
    }
}
