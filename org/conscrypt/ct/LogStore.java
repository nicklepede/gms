package com.google.android.gms.org.conscrypt.ct;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public interface LogStore {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public enum State {
        UNINITIALIZED,
        NOT_FOUND,
        MALFORMED,
        LOADED,
        COMPLIANT,
        NON_COMPLIANT
    }

    int getCompatVersion();

    LogInfo getKnownLog(byte[] bArr);

    int getMajorVersion();

    int getMinCompatVersionAvailable();

    int getMinorVersion();

    State getState();

    long getTimestamp();
}
