package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.coke;
import defpackage.cokf;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StreamAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cokf();
    public final String a;
    public final long b;
    public final Bundle c;
    public final Messenger d;
    public final String e;
    public final String f;
    private final ParcelFileDescriptor g;
    private final ParcelFileDescriptor h;

    public StreamAttachment(String str, long j, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, Messenger messenger, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = bundle;
        this.g = parcelFileDescriptor;
        this.h = parcelFileDescriptor2;
        this.d = messenger;
        this.e = str2;
        this.f = str3;
    }

    public static ShareTarget e(ShareTarget shareTarget) {
        if (shareTarget.g().isEmpty()) {
            return shareTarget;
        }
        StreamAttachment streamAttachment = (StreamAttachment) shareTarget.g().get(0);
        ShareTarget a = shareTarget.b().a();
        a.o();
        coke f = streamAttachment.f();
        f.c = null;
        f.b = null;
        f.d = null;
        a.l(f.b());
        return a;
    }

    public static void p(Messenger messenger, int i) {
        Message obtain = Message.obtain();
        try {
            obtain.what = i;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
        }
    }

    private static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final ParcelFileDescriptor r(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null || !parcelFileDescriptor.getFileDescriptor().valid()) {
            return null;
        }
        return parcelFileDescriptor;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.b;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return 1048576L;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StreamAttachment) {
            StreamAttachment streamAttachment = (StreamAttachment) obj;
            if (atyq.b(this.a, streamAttachment.a) && atyq.b(this.e, streamAttachment.e) && atyq.b(Long.valueOf(this.b), Long.valueOf(streamAttachment.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int h() {
        return 6;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.e, Long.valueOf(this.b)});
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final coke f() {
        coke cokeVar = new coke(this.a);
        cokeVar.b = this.g;
        cokeVar.c = this.h;
        cokeVar.d = this.d;
        cokeVar.e = this.e;
        cokeVar.f = this.f;
        cokeVar.a = this.b;
        return cokeVar;
    }

    public final void o() {
        q(this.h);
        Messenger messenger = this.d;
        p(messenger, 0);
        q(this.g);
        p(messenger, 2);
        p(messenger, 1);
        p(messenger, 3);
    }

    public final String toString() {
        String str = this.a;
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.b);
        Bundle bundle = this.c;
        ParcelFileDescriptor parcelFileDescriptor = this.g;
        ParcelFileDescriptor parcelFileDescriptor2 = this.h;
        Messenger messenger = this.d;
        return String.format(locale, "StreamAttachment<description: %s, id: %s,extras: %s, localRead: %s, localWrite: %s, messengerBinder: %s, packageName: %s, attributedAppName: %s>", str, valueOf, bundle, parcelFileDescriptor, parcelFileDescriptor2, messenger != null ? messenger.getBinder() : null, this.e, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.g(parcel, 3, this.c, false);
        ParcelFileDescriptor r = r(this.g);
        atzr.t(parcel, 4, r == null ? null : new ParcelFileDescriptor(r) { // from class: com.google.android.gms.nearby.sharing.StreamAttachment.2
            @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                super.close();
                StreamAttachment.p(StreamAttachment.this.d, 2);
            }
        }, i, false);
        ParcelFileDescriptor r2 = r(this.h);
        atzr.t(parcel, 5, r2 != null ? new ParcelFileDescriptor(r2) { // from class: com.google.android.gms.nearby.sharing.StreamAttachment.1
            @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                super.close();
                StreamAttachment.p(StreamAttachment.this.d, 0);
            }
        } : null, i, false);
        atzr.t(parcel, 6, this.d, i, false);
        atzr.v(parcel, 7, this.e, false);
        atzr.v(parcel, 8, this.f, false);
        atzr.c(parcel, a);
    }
}
