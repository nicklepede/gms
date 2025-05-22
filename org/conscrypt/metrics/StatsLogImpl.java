package com.google.android.gms.org.conscrypt.metrics;

import com.google.android.gms.org.conscrypt.Platform;
import com.google.android.gms.org.conscrypt.ct.LogStore;
import com.google.android.gms.org.conscrypt.ct.PolicyCompliance;
import com.google.android.gms.org.conscrypt.ct.VerificationResult;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StatsLogImpl implements StatsLog {
    private static final ExecutorService e = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "ConscryptStatsLog");
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(this) { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.1.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                }
            });
            return thread;
        }
    });
    private static final StatsLog INSTANCE = new StatsLogImpl();
    private static final boolean sdkVersionBiggerThan32 = Platform.isSdkGreater(32);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$ct$LogStore$State;

        static {
            int[] iArr = new int[LogStore.State.values().length];
            $SwitchMap$org$conscrypt$ct$LogStore$State = iArr;
            try {
                iArr[LogStore.State.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.MALFORMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.COMPLIANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.NON_COMPLIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private StatsLogImpl() {
    }

    public static StatsLog getInstance() {
        return INSTANCE;
    }

    private static int logStoreStateToMetricsState(LogStore.State state) {
        LogStore.State state2 = LogStore.State.UNINITIALIZED;
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 4) {
            return ordinal != 5 ? 0 : 4;
        }
        return 1;
    }

    private static int policyComplianceToMetrics(VerificationResult verificationResult, PolicyCompliance policyCompliance) {
        if (policyCompliance == PolicyCompliance.COMPLY) {
            return 1;
        }
        if (verificationResult.getValidSCTs().size() == 0) {
            return 3;
        }
        return (policyCompliance == PolicyCompliance.NOT_ENOUGH_SCTS || policyCompliance == PolicyCompliance.NOT_ENOUGH_DIVERSE_SCTS) ? 4 : 0;
    }

    private void write(final int i, final int i2, final int i3, final int i4, final int i5) {
        e.execute(new Runnable(this) { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.5
            @Override // java.lang.Runnable
            public void run() {
                ConscryptStatsLog.write(i, i2, i3, i4, i5);
            }
        });
    }

    @Override // com.google.android.gms.org.conscrypt.metrics.StatsLog
    public void countServiceUsage(int i, int i2, int i3, int i4) {
        write(965, i, i2, i3, i4);
    }

    @Override // com.google.android.gms.org.conscrypt.metrics.StatsLog
    public void countTlsHandshake(boolean z, String str, String str2, long j) {
        int i = (int) j;
        write(317, z, Protocol.forName(str).getId(), CipherSuite.forName(str2).getId(), i, Platform.getStatsSource().getId(), Platform.getUids());
    }

    @Override // com.google.android.gms.org.conscrypt.metrics.StatsLog
    public void reportCTVerificationResult(LogStore logStore, VerificationResult verificationResult, PolicyCompliance policyCompliance, CertificateTransparencyVerificationReason certificateTransparencyVerificationReason) {
        if (logStore.getState() == LogStore.State.NOT_FOUND || logStore.getState() == LogStore.State.MALFORMED) {
            write(989, 5, certificateTransparencyVerificationReason.getId(), 0, 0, 0, 0, 0, 0);
        } else if (logStore.getState() == LogStore.State.NON_COMPLIANT) {
            write(989, 6, certificateTransparencyVerificationReason.getId(), 0, 0, 0, 0, 0, 0);
        } else if (logStore.getState() == LogStore.State.COMPLIANT) {
            write(989, policyComplianceToMetrics(verificationResult, policyCompliance), certificateTransparencyVerificationReason.getId(), logStore.getCompatVersion(), logStore.getMajorVersion(), logStore.getMinorVersion(), verificationResult.numCertSCTs(), verificationResult.numOCSPSCTs(), verificationResult.numTlsSCTs());
        }
    }

    @Override // com.google.android.gms.org.conscrypt.metrics.StatsLog
    public void updateCTLogListStatusChanged(LogStore logStore) {
        write(934, logStoreStateToMetricsState(logStore.getState()), logStore.getCompatVersion(), logStore.getMinCompatVersionAvailable(), logStore.getMajorVersion(), logStore.getMinorVersion());
    }

    private void write(final int i, final int i2, final int i3, final int i4, final int i5, final int i6) {
        e.execute(new Runnable(this) { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.3
            @Override // java.lang.Runnable
            public void run() {
                ConscryptStatsLog.write(i, i2, i3, i4, i5, i6);
            }
        });
    }

    private void write(final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final int i8, final int i9) {
        e.execute(new Runnable(this) { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.4
            @Override // java.lang.Runnable
            public void run() {
                ConscryptStatsLog.write(i, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    private void write(final int i, final boolean z, final int i2, final int i3, final int i4, final int i5, final int[] iArr) {
        e.execute(new Runnable(this) { // from class: com.google.android.gms.org.conscrypt.metrics.StatsLogImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (StatsLogImpl.sdkVersionBiggerThan32) {
                    GeneratedStatsLog.write(i, z, i2, i3, i4, i5, iArr);
                } else {
                    ConscryptStatsLog.write(i, z, i2, i3, i4, i5, iArr);
                }
            }
        });
    }
}
