package com.google.android.gms.mdns;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdns.MdnsServiceInfo;
import defpackage.atzr;
import defpackage.cfky;
import defpackage.cfmn;
import defpackage.ekut;
import defpackage.eles;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elja;
import defpackage.elkk;
import defpackage.elmt;
import defpackage.eqaj;
import defpackage.eqba;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public final Network m;
    public final elgx n;
    public static final Charset a = Charset.forName("us-ascii");
    public static final Charset b = Charset.forName("utf-8");
    public static final Parcelable.Creator CREATOR = new cfky();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class TextEntry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cfmn();
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
            int a = eqba.a(bArr, (byte) 61);
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
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.i(parcel, 2, b(), false);
            atzr.c(parcel, a);
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
    public MdnsServiceInfo(java.lang.String r16, java.lang.String[] r17, java.util.List r18, java.lang.String[] r19, int r20, java.lang.String r21, java.lang.String r22, java.util.List r23, java.util.List r24, int r25) {
        /*
            r15 = this;
            if (r21 == 0) goto L7
            elgo r0 = defpackage.elgo.l(r21)
            goto Lb
        L7:
            int r0 = defpackage.elgo.d
            elgo r0 = defpackage.elpg.a
        Lb:
            r12 = r0
            if (r22 == 0) goto L13
            elgo r0 = defpackage.elgo.l(r22)
            goto L15
        L13:
            elgo r0 = defpackage.elpg.a
        L15:
            r13 = r0
            r8 = 0
            r14 = 0
            r7 = 0
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r9 = r23
            r10 = r24
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
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
        return (String) elja.o(this.k, null);
    }

    @Deprecated
    public final String c() {
        return (String) elja.o(this.l, null);
    }

    public final /* synthetic */ Inet6Address d(String str) {
        int i;
        Inet6Address inet6Address = (Inet6Address) eqaj.b(str);
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
        return elkk.h(this.k, new ekut() { // from class: cfkx
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Charset charset = MdnsServiceInfo.a;
                return (Inet4Address) eqaj.b((String) obj);
            }
        });
    }

    public final List f() {
        return new ArrayList(this.e);
    }

    public final byte[] g(String str) {
        return (byte[]) this.n.get(str.toLowerCase(Locale.ENGLISH));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "Name: %s, subtypes: %s, ips: %s, port: %d, texts: %s, network: %s", this.c, TextUtils.join(",", this.e), TextUtils.join(",", eles.f(this.k, this.l)), Integer.valueOf(this.g), TextUtils.join(",", this.h), this.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.w(parcel, 3, this.d, false);
        atzr.x(parcel, 4, f(), false);
        atzr.w(parcel, 5, this.f, false);
        atzr.o(parcel, 6, this.g);
        atzr.v(parcel, 7, b(), false);
        atzr.v(parcel, 8, c(), false);
        atzr.x(parcel, 9, this.h, false);
        atzr.y(parcel, 10, this.i, false);
        atzr.o(parcel, 11, this.j);
        atzr.x(parcel, 12, this.k, false);
        atzr.x(parcel, 13, this.l, false);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.c(parcel, a2);
    }

    public MdnsServiceInfo(String str, String[] strArr, List list, String[] strArr2, int i, String str2, String str3, List list2, List list3, int i2, List list4, List list5, Network network) {
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
            list4 = elgo.l(str2);
        }
        this.k = list4;
        if (str3 != null && list5.isEmpty()) {
            list5 = elgo.l(str3);
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
            elgj e = elgo.e(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                TextEntry a2 = TextEntry.a(((String) it.next()).getBytes(b));
                if (a2 != null) {
                    e.i(a2);
                }
            }
            arrayList3 = e.g();
        }
        HashMap k = elmt.k(arrayList3.size());
        for (TextEntry textEntry : arrayList3) {
            String lowerCase = textEntry.a.toLowerCase(Locale.ENGLISH);
            if (!k.containsKey(lowerCase)) {
                k.put(lowerCase, textEntry.b());
            }
        }
        this.n = elgx.k(k);
        this.j = i2;
        this.m = network;
    }
}
