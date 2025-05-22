package com.google.android.gms.backup.common.util.session;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.backup.common.util.session.$AutoValue_ParcelableSession, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_ParcelableSession extends ParcelableSession {
    public final byte[] a;

    public C$AutoValue_ParcelableSession(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null auditTokenBytes");
        }
        this.a = bArr;
    }

    @Override // com.google.android.gms.backup.common.util.session.ParcelableSession
    protected final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParcelableSession)) {
            return false;
        }
        ParcelableSession parcelableSession = (ParcelableSession) obj;
        return Arrays.equals(this.a, parcelableSession instanceof C$AutoValue_ParcelableSession ? ((C$AutoValue_ParcelableSession) parcelableSession).a : parcelableSession.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }

    public final String toString() {
        return "ParcelableSession{auditTokenBytes=" + Arrays.toString(this.a) + "}";
    }
}
