package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import defpackage.atyq;
import defpackage.coiu;
import defpackage.coiw;
import defpackage.elgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ShareTarget extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new coiw();
    public final long a;
    public final String b;
    public final Uri c;
    public final int d;
    public final Bundle e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final PendingIntent j;
    public final boolean k;
    public final String l;
    public final int m;
    public final boolean n;
    public int o;
    public final String p;
    public final boolean q;
    public final int r;
    public ParcelByteArray s;
    public final int t;
    private final List u;
    private final List v;
    private final List w;
    private final List x;
    private final List y;
    private transient List z;

    public ShareTarget(long j, String str, Uri uri, int i, Bundle bundle, List list, List list2, List list3, boolean z, String str2, boolean z2, String str3, PendingIntent pendingIntent, boolean z3, String str4, List list4, int i2, boolean z4, List list5, int i3, String str5, boolean z5, int i4, ParcelByteArray parcelByteArray, int i5) {
        this.a = j;
        this.b = str;
        this.c = uri;
        this.d = i;
        this.e = bundle;
        this.u = list;
        this.v = list2;
        this.w = list3;
        this.x = list4;
        this.y = list5;
        this.f = z;
        this.g = str2;
        this.h = z2;
        this.i = str3;
        this.j = pendingIntent;
        this.k = z3;
        this.l = str4;
        this.m = i2;
        this.n = z4;
        this.o = i3;
        this.p = str5;
        this.q = z5;
        this.r = i4;
        this.t = i5;
        if (parcelByteArray != null) {
            o();
            byte[] bArr = parcelByteArray.a;
            Parcelable.Creator creator = FileAttachment.CREATOR;
            try {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    ArrayList arrayList = new ArrayList();
                    obtain.readTypedList(arrayList, creator);
                    obtain.recycle();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        k((FileAttachment) it.next());
                    }
                    this.s = null;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Deprecated
    public final int a() {
        return this.h ? Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.f), this.g, true, this.i, Boolean.valueOf(this.k), this.l, Integer.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.r)}) : Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.f), this.g, false, this.i, Boolean.valueOf(this.k), Integer.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.r)});
    }

    public final synchronized coiu b() {
        coiu coiuVar;
        coiuVar = new coiu();
        coiuVar.a = this.a;
        coiuVar.b = this.b;
        coiuVar.c = this.c;
        coiuVar.d = this.d;
        coiuVar.e = this.e;
        coiuVar.f = new ArrayList(this.u);
        coiuVar.g = new ArrayList(this.v);
        coiuVar.h = new ArrayList(this.w);
        coiuVar.i = new ArrayList(this.x);
        coiuVar.j = new ArrayList(this.y);
        coiuVar.k = this.f;
        coiuVar.l = this.g;
        coiuVar.m = this.h;
        coiuVar.n = this.i;
        coiuVar.o = this.j;
        coiuVar.p = this.k;
        coiuVar.q = this.l;
        coiuVar.r = this.m;
        coiuVar.s = this.n;
        coiuVar.t = this.o;
        coiuVar.u = this.p;
        coiuVar.v = this.q;
        coiuVar.w = this.r;
        coiuVar.x = this.s;
        return coiuVar;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized ShareTarget clone() {
        try {
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (ShareTarget) super.clone();
    }

    public final synchronized List d() {
        return new ArrayList(this.x);
    }

    public final synchronized List e() {
        if (this.z == null) {
            ArrayList arrayList = new ArrayList();
            this.z = arrayList;
            arrayList.addAll(this.v);
            this.z.addAll(this.u);
            this.z.addAll(this.w);
            this.z.addAll(this.x);
            this.z.addAll(this.y);
        }
        return new ArrayList(this.z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ShareTarget) {
            ShareTarget shareTarget = (ShareTarget) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(shareTarget.a)) && atyq.b(this.b, shareTarget.b) && atyq.b(this.c, shareTarget.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(shareTarget.d)) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(shareTarget.f)) && atyq.b(this.g, shareTarget.g) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(shareTarget.h)) && atyq.b(this.i, shareTarget.i) && atyq.b(Boolean.valueOf(this.k), Boolean.valueOf(shareTarget.k)) && atyq.b(this.l, shareTarget.l) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(shareTarget.m)) && atyq.b(Boolean.valueOf(this.n), Boolean.valueOf(shareTarget.n)) && atyq.b(this.p, shareTarget.p) && atyq.b(Integer.valueOf(this.r), Integer.valueOf(shareTarget.r)) && atyq.b(this.s, shareTarget.s) && atyq.b(Boolean.valueOf(this.q), Boolean.valueOf(shareTarget.q))) {
                return true;
            }
        }
        return false;
    }

    public final synchronized List f() {
        return new ArrayList(this.v);
    }

    public final synchronized List g() {
        return new ArrayList(this.y);
    }

    public final synchronized List h() {
        return new ArrayList(this.u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.f), this.g, Boolean.valueOf(this.h), this.i, Boolean.valueOf(this.k), this.l, Integer.valueOf(this.m), Boolean.valueOf(this.n), this.p, Integer.valueOf(this.r), Boolean.valueOf(this.q)});
    }

    public final synchronized List i() {
        return new ArrayList(this.w);
    }

    public final synchronized void j(AppAttachment appAttachment) {
        this.x.add(appAttachment);
        this.z = null;
    }

    public final synchronized void k(FileAttachment fileAttachment) {
        List list = this.v;
        if (list != null) {
            list.add(fileAttachment);
        }
        this.z = null;
    }

    public final synchronized void l(StreamAttachment streamAttachment) {
        this.y.add(streamAttachment);
        this.z = null;
    }

    public final synchronized void m(TextAttachment textAttachment) {
        this.u.add(textAttachment);
        this.z = null;
    }

    public final synchronized void n(WifiCredentialsAttachment wifiCredentialsAttachment) {
        this.w.add(wifiCredentialsAttachment);
        this.z = null;
    }

    public final synchronized void o() {
        List list = this.u;
        if (list != null) {
            list.clear();
        }
        List list2 = this.v;
        if (list2 != null) {
            list2.clear();
        }
        List list3 = this.w;
        if (list3 != null) {
            list3.clear();
        }
        List list4 = this.x;
        if (list4 != null) {
            list4.clear();
        }
        List list5 = this.y;
        if (list5 != null) {
            list5.clear();
        }
        this.z = null;
    }

    public final boolean p() {
        return !this.f;
    }

    @Deprecated
    public final boolean q(ShareTarget shareTarget) {
        if (shareTarget == null) {
            return false;
        }
        return atyq.b(this, shareTarget) || a() == shareTarget.a();
    }

    public final synchronized boolean r(AppAttachment appAttachment, AppAttachment appAttachment2) {
        if (appAttachment.equals(appAttachment2)) {
            return true;
        }
        this.z = null;
        return Collections.replaceAll(this.x, appAttachment, appAttachment2);
    }

    public final synchronized boolean s(FileAttachment fileAttachment, FileAttachment fileAttachment2) {
        if (fileAttachment.equals(fileAttachment2)) {
            return true;
        }
        this.z = null;
        return Collections.replaceAll(this.v, fileAttachment, fileAttachment2);
    }

    public final synchronized boolean t(TextAttachment textAttachment, TextAttachment textAttachment2) {
        if (textAttachment.equals(textAttachment2)) {
            return true;
        }
        this.z = null;
        return Collections.replaceAll(this.u, textAttachment, textAttachment2);
    }

    public final String toString() {
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(this.m);
        Long valueOf2 = Long.valueOf(this.a);
        String str = this.b;
        String str2 = this.g;
        Uri uri = this.c;
        int i = this.d;
        return String.format(locale, "ShareTarget<version: %s, id: %d, deviceName: %s, fullName: %s, imageUri: %s, type: %s, fileAttachmentSize: %d, unredactedFileAttachmentSize: %d, textAttachmentSize: %d, wifiCredentialsAttachmentSize %d, appAttachmentSize: %d, streamAttachmentSize: %d, isKnown: %s, isIncoming: %s, groupName: %s, action: %s, isExternal: %s, deviceId: %s, hasSharedAccount: %s, useCase: %s, modelName: %s, isOutgoingQrCodeMatching: %s, vendorId: %s>", valueOf, valueOf2, str, str2, uri, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CAR" : "LAPTOP" : "TABLET" : "PHONE", Integer.valueOf(f().size()), Integer.valueOf(this.e.getInt("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", f().size())), Integer.valueOf(h().size()), Integer.valueOf(i().size()), Integer.valueOf(d().size()), Integer.valueOf(g().size()), Boolean.valueOf(this.h), Boolean.valueOf(this.f), this.i, this.j, Boolean.valueOf(this.k), this.l, Boolean.valueOf(this.n), Integer.valueOf(this.o), this.p, Boolean.valueOf(this.q), Integer.valueOf(this.r));
    }

    public final synchronized boolean u(WifiCredentialsAttachment wifiCredentialsAttachment, WifiCredentialsAttachment wifiCredentialsAttachment2) {
        if (wifiCredentialsAttachment.equals(wifiCredentialsAttachment2)) {
            return true;
        }
        this.z = null;
        return Collections.replaceAll(this.w, wifiCredentialsAttachment, wifiCredentialsAttachment2);
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        int size = e().size();
        int i2 = this.t;
        if (size > i2 && (i & 16) == 0) {
            this.e.putInt("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", e().size());
            List list = this.v;
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list.subList(0, i2));
            list.clear();
            list.addAll(arrayList2);
            if ((i & 32) == 0) {
                ParcelByteArray parcelByteArray = new ParcelByteArray();
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeTypedList(elgo.i(arrayList));
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    parcelByteArray.a = marshall;
                    this.s = parcelByteArray;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
            coiw.a(this, parcel, i);
            List list2 = this.v;
            list2.clear();
            list2.addAll(arrayList);
            this.s = null;
            return;
        }
        coiw.a(this, parcel, i);
    }
}
