package com.google.android.gms.org.conscrypt.ct;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public interface LogStore {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
