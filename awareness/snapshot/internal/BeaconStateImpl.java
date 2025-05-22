package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState$TypeFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.ajha;
import defpackage.ajhb;
import defpackage.ajhn;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.ffrk;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.sdz;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhb();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ajha();
        public final String a;
        public final String b;
        public final byte[] c;

        public BeaconInfoImpl(String str, String str2, byte[] bArr) {
            atzb.q(str);
            this.a = str;
            atzb.q(str2);
            this.b = str2;
            this.c = bArr;
        }

        public final String toString() {
            return "(" + this.a + ", " + this.b + ", " + new String(this.c) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, str, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.i(parcel, 4, this.c, false);
            atzr.c(parcel, a);
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
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, arrayList, false);
        atzr.c(parcel, a);
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class TypeFilterImpl extends BeaconState$TypeFilter {
        public static final Parcelable.Creator CREATOR = new ajhn();
        private final ffrk a;

        public TypeFilterImpl(String str, String str2) {
            fgrc v = ffrk.a.v();
            atzb.q(str);
            if (!v.b.L()) {
                v.U();
            }
            ffrk ffrkVar = (ffrk) v.b;
            str.getClass();
            ffrkVar.b |= 1;
            ffrkVar.c = str;
            atzb.q(str2);
            if (!v.b.L()) {
                v.U();
            }
            ffrk ffrkVar2 = (ffrk) v.b;
            str2.getClass();
            ffrkVar2.b |= 2;
            ffrkVar2.d = str2;
            this.a = (ffrk) v.Q();
        }

        public final String a() {
            ffrk ffrkVar = this.a;
            if (ffrkVar == null) {
                return null;
            }
            return ffrkVar.c;
        }

        public final String b() {
            ffrk ffrkVar = this.a;
            if (ffrkVar == null) {
                return null;
            }
            return ffrkVar.d;
        }

        public final boolean c(String str, String str2, byte[] bArr) {
            if (TextUtils.equals(str, a()) && TextUtils.equals(str2, b())) {
                return d() == null || Arrays.equals(bArr, d());
            }
            return false;
        }

        public final byte[] d() {
            ffrk ffrkVar = this.a;
            if (ffrkVar == null || ffrkVar.e.d() == 0) {
                return null;
            }
            return ffrkVar.e.M();
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
            return a.Y(d == null ? "null" : new String(d), b(), new StringBuilder(), a, "(", ",", ",", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ffrk ffrkVar = this.a;
            int a = atzr.a(parcel);
            atzr.i(parcel, 2, ffrkVar.r(), false);
            atzr.c(parcel, a);
        }

        public TypeFilterImpl(byte[] bArr) {
            ffrk ffrkVar;
            try {
                fgri y = fgri.y(ffrk.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                ffrkVar = (ffrk) y;
            } catch (fgsd unused) {
                sdz.a("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
                ffrkVar = null;
            }
            atzb.s(ffrkVar);
            this.a = ffrkVar;
        }
    }
}
