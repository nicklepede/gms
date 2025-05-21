package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdns.MdnsServiceInfo;
import defpackage.arxc;
import defpackage.cdby;
import defpackage.cddo;
import defpackage.eiho;
import defpackage.eirn;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eivv;
import defpackage.eixf;
import defpackage.eizo;
import defpackage.enmp;
import defpackage.enng;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdnsServiceInfo extends AbstractSafeParcelable {
    public final String c;
    public final String[] d;
    public final List e;
    public final String[] f;
    public final int g;
    final List h;
    final List i;
    public final int j;
    final List k;
    public final List l;
    public final eits m;
    public static final Charset a = Charset.forName("us-ascii");
    public static final Charset b = Charset.forName("utf-8");
    public static final Parcelable.Creator CREATOR = new cdby();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class TextEntry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cddo();
        public final String a;
        private final byte[] b;

        public TextEntry(String str, String str2) {
            this(str, str2.getBytes(MdnsServiceInfo.b));
        }

        public static TextEntry a(byte[] bArr) {
            int length = bArr.length;
            if (length == 0) {
                return null;
            }
            int a = enng.a(bArr, (byte) 61);
            if (a < 0) {
                return new TextEntry(new String(bArr, MdnsServiceInfo.a), "");
            }
            if (a != 0) {
                return new TextEntry(new String(Arrays.copyOf(bArr, a), MdnsServiceInfo.a), Arrays.copyOfRange(bArr, a + 1, length));
            }
            return null;
        }

        public final byte[] b() {
            return (byte[]) this.b.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextEntry)) {
                return false;
            }
            TextEntry textEntry = (TextEntry) obj;
            return this.a.equals(textEntry.a) && Arrays.equals(this.b, textEntry.b);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
        }

        public final String toString() {
            return this.a + "=" + new String(this.b, MdnsServiceInfo.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.i(parcel, 2, b(), false);
            arxc.c(parcel, a);
        }

        public TextEntry(String str, byte[] bArr) {
            this.a = str;
            this.b = (byte[]) bArr.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MdnsServiceInfo(java.lang.String r15, java.lang.String[] r16, java.util.List r17, java.lang.String[] r18, int r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, int r24) {
        /*
            r14 = this;
            if (r20 == 0) goto L7
            eitj r0 = defpackage.eitj.l(r20)
            goto Lb
        L7:
            int r0 = defpackage.eitj.d
            eitj r0 = defpackage.ejcb.a
        Lb:
            r12 = r0
            if (r21 == 0) goto L13
            eitj r0 = defpackage.eitj.l(r21)
            goto L15
        L13:
            eitj r0 = defpackage.ejcb.a
        L15:
            r13 = r0
            r7 = 0
            r8 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r22
            r10 = r23
            r11 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdns.MdnsServiceInfo.<init>(java.lang.String, java.lang.String[], java.util.List, java.lang.String[], int, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    public final String a(String str) {
        byte[] g = g(str);
        if (g == null) {
            return null;
        }
        return new String(g, b);
    }

    @Deprecated
    public final String b() {
        return (String) eivv.o(this.k, null);
    }

    @Deprecated
    public final String c() {
        return (String) eivv.o(this.l, null);
    }

    public final /* synthetic */ Inet6Address d(String str) {
        int i;
        Inet6Address inet6Address = (Inet6Address) enmp.b(str);
        if (!inet6Address.isLinkLocalAddress() || (i = this.j) <= 0) {
            return inet6Address;
        }
        try {
            return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
        } catch (UnknownHostException e) {
            throw new AssertionError("Cannot happen as we are constructing from existing address.", e);
        }
    }

    public final List e() {
        return eixf.h(this.k, new eiho() { // from class: cdbx
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Charset charset = MdnsServiceInfo.a;
                return (Inet4Address) enmp.b((String) obj);
            }
        });
    }

    public final List f() {
        return new ArrayList(this.e);
    }

    public final byte[] g(String str) {
        return (byte[]) this.m.get(str.toLowerCase(Locale.ENGLISH));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "Name: %s, subtypes: %s, ips: %s, port: %d, texts: %s", this.c, TextUtils.join(",", this.e), TextUtils.join(",", eirn.f(this.k, this.l)), Integer.valueOf(this.g), TextUtils.join(",", this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.w(parcel, 3, this.d, false);
        arxc.x(parcel, 4, f(), false);
        arxc.w(parcel, 5, this.f, false);
        arxc.o(parcel, 6, this.g);
        arxc.v(parcel, 7, b(), false);
        arxc.v(parcel, 8, c(), false);
        arxc.x(parcel, 9, this.h, false);
        arxc.y(parcel, 10, this.i, false);
        arxc.o(parcel, 11, this.j);
        arxc.x(parcel, 12, this.k, false);
        arxc.x(parcel, 13, this.l, false);
        arxc.c(parcel, a2);
    }

    public MdnsServiceInfo(String str, String[] strArr, List list, String[] strArr2, int i, String str2, String str3, List list2, List list3, int i2, List list4, List list5) {
        this.c = str;
        this.d = strArr;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f = strArr2;
        this.g = i;
        if (str2 != null && list4.isEmpty()) {
            list4 = eitj.l(str2);
        }
        this.k = list4;
        if (str3 != null && list5.isEmpty()) {
            list5 = eitj.l(str3);
        }
        this.l = list5;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        List<TextEntry> arrayList3 = list3 == null ? null : new ArrayList(list3);
        this.i = arrayList3;
        if (arrayList3 == null) {
            eite e = eitj.e(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                TextEntry a2 = TextEntry.a(((String) it.next()).getBytes(b));
                if (a2 != null) {
                    e.i(a2);
                }
            }
            arrayList3 = e.g();
        }
        HashMap k = eizo.k(arrayList3.size());
        for (TextEntry textEntry : arrayList3) {
            String lowerCase = textEntry.a.toLowerCase(Locale.ENGLISH);
            if (!k.containsKey(lowerCase)) {
                k.put(lowerCase, textEntry.b());
            }
        }
        this.m = eits.k(k);
        this.j = i2;
    }
}
