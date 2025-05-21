package com.google.android.gms.autofill.data;

import com.google.android.gms.autofill.data.Credential;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.autofill.data.$AutoValue_Credential_LeakedPasswordIssue, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_Credential_LeakedPasswordIssue extends Credential.LeakedPasswordIssue {
    public final long a;
    public final boolean b;

    public C$AutoValue_Credential_LeakedPasswordIssue(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // com.google.android.gms.autofill.data.Credential.LeakedPasswordIssue
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.autofill.data.Credential.LeakedPasswordIssue
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Credential.LeakedPasswordIssue) {
            Credential.LeakedPasswordIssue leakedPasswordIssue = (Credential.LeakedPasswordIssue) obj;
            if (this.a == leakedPasswordIssue.a() && this.b == leakedPasswordIssue.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        long j = this.a;
        return i ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LeakedPasswordIssue{timestampWindowsEpoch=" + this.a + ", muted=" + this.b + "}";
    }
}
