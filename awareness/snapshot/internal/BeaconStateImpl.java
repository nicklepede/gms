package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState$TypeFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.ahgk;
import defpackage.ahgl;
import defpackage.ahgx;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.fdct;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.qkv;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgl();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ahgk();
        public final String a;
        public final String b;
        public final byte[] c;

        public BeaconInfoImpl(String str, String str2, byte[] bArr) {
            arwm.q(str);
            this.a = str;
            arwm.q(str2);
            this.b = str2;
            this.c = bArr;
        }

        public final String toString() {
            return "(" + this.a + ", " + this.b + ", " + new String(this.c) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 2, str, false);
            arxc.v(parcel, 3, this.b, false);
            arxc.i(parcel, 4, this.c, false);
            arxc.c(parcel, a);
        }
    }

    public BeaconStateImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder("BeaconState: ");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append((BeaconInfoImpl) arrayList.get(i));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, arrayList, false);
        arxc.c(parcel, a);
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class TypeFilterImpl extends BeaconState$TypeFilter {
        public static final Parcelable.Creator CREATOR = new ahgx();
        private final fdct a;

        public TypeFilterImpl(String str, String str2) {
            fecj v = fdct.a.v();
            arwm.q(str);
            if (!v.b.L()) {
                v.U();
            }
            fdct fdctVar = (fdct) v.b;
            str.getClass();
            fdctVar.b |= 1;
            fdctVar.c = str;
            arwm.q(str2);
            if (!v.b.L()) {
                v.U();
            }
            fdct fdctVar2 = (fdct) v.b;
            str2.getClass();
            fdctVar2.b |= 2;
            fdctVar2.d = str2;
            this.a = (fdct) v.Q();
        }

        public final String a() {
            fdct fdctVar = this.a;
            if (fdctVar == null) {
                return null;
            }
            return fdctVar.c;
        }

        public final String b() {
            fdct fdctVar = this.a;
            if (fdctVar == null) {
                return null;
            }
            return fdctVar.d;
        }

        public final boolean c(String str, String str2, byte[] bArr) {
            if (TextUtils.equals(str, a()) && TextUtils.equals(str2, b())) {
                return d() == null || Arrays.equals(bArr, d());
            }
            return false;
        }

        public final byte[] d() {
            fdct fdctVar = this.a;
            if (fdctVar == null || fdctVar.e.d() == 0) {
                return null;
            }
            return fdctVar.e.M();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeFilterImpl)) {
                return false;
            }
            TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
            return TextUtils.equals(a(), typeFilterImpl.a()) && TextUtils.equals(b(), typeFilterImpl.b()) && Arrays.equals(d(), typeFilterImpl.d());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{a(), b(), Integer.valueOf(d() == null ? 0 : Arrays.hashCode(d()))});
        }

        public final String toString() {
            byte[] d = d();
            String a = a();
            return a.X(d == null ? "null" : new String(d), b(), new StringBuilder(), a, "(", ",", ",", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fdct fdctVar = this.a;
            int a = arxc.a(parcel);
            arxc.i(parcel, 2, fdctVar.r(), false);
            arxc.c(parcel, a);
        }

        public TypeFilterImpl(byte[] bArr) {
            fdct fdctVar;
            try {
                fecp y = fecp.y(fdct.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                fdctVar = (fdct) y;
            } catch (fedk unused) {
                qkv.a("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
                fdctVar = null;
            }
            arwm.s(fdctVar);
            this.a = fdctVar;
        }
    }
}
