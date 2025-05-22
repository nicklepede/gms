package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesCollapsingToolbarChimeraSettings;
import defpackage.aby;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.dixx;
import defpackage.djad;
import defpackage.djce;
import defpackage.djdp;
import defpackage.eluo;
import defpackage.ozo;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustedDevicesCollapsingToolbarChimeraSettings extends dixx implements djad, aby {
    private static final ausn l = ausn.b("TrustAgent", auid.TRUSTAGENT);
    public djce k;
    private boolean m = false;

    @Override // defpackage.dixu
    protected final ozo a() {
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            int i = extras != null ? extras.getInt("notification_type_key", -1) : -1;
            if (i >= 0) {
                bundle.putInt("notification_type", i);
            }
        }
        djdp djdpVar = new djdp();
        djdpVar.setArguments(bundle);
        return djdpVar;
    }

    @Override // defpackage.djad
    public final void b() {
        k().P();
    }

    @Override // defpackage.dixu
    protected final String f() {
        return "TrustedDevicesFragment";
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ void jF(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (auub.f()) {
            j.intValue();
            if (i == -11) {
                finish();
                i = -11;
            }
        }
        Intent intent = activityResult.b;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_request_code", 0);
        if (i == -1) {
            if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.DEVICE_ENROLLED_IN_ACTIVE_UNLOCK")) {
                k().N((TrustableDevice) TrustableDevice.e(intent).orElseThrow());
            } else if (intExtra != 1002) {
                ((eluo) l.j()).x("Unknown intent action or request code");
            } else if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.ADD_DEVICE")) {
                TrustableDevice.e(intent).ifPresent(new Consumer() { // from class: djcw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj2) {
                        TrustedDevicesCollapsingToolbarChimeraSettings.this.k.a((TrustableDevice) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    public final djdp k() {
        return (djdp) getSupportFragmentManager().h("TrustedDevicesFragment");
    }

    @Override // defpackage.dixx, defpackage.dixu, defpackage.dixt, defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = new djce(this);
        if (bundle != null) {
            this.m = bundle.getBoolean("TrustedDeviceDialogActionTakenKey", false);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.dixu, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.trusted_devices_actions_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.auth_trust_agent_bluetooth_disabled_help_link))));
        return true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("TrustedDeviceDialogActionTakenKey", this.m);
        super.onSaveInstanceState(bundle);
    }
}
