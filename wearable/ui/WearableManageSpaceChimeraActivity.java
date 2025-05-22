package com.google.android.gms.wearable.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.dotv;
import defpackage.dotw;
import defpackage.dotx;
import defpackage.ill;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearableManageSpaceChimeraActivity extends ryt implements AdapterView.OnItemClickListener, View.OnClickListener {
    public View j;
    public TextView k;
    public Button l;
    public ListView m;
    private dotx n;
    private dotw o;

    public final void a() {
        this.j.setVisibility(0);
        this.l.setEnabled(false);
        dotx dotxVar = this.n;
        if (dotxVar != null) {
            dotxVar.cancel(true);
        }
        dotx dotxVar2 = new dotx(this);
        this.n = dotxVar2;
        dotxVar2.execute(new Void[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Button button = this.l;
        if (view == button) {
            button.setEnabled(false);
            this.j.setVisibility(0);
            this.l.setEnabled(false);
            dotw dotwVar = this.o;
            if (dotwVar != null) {
                dotwVar.cancel(true);
            }
            dotw dotwVar2 = new dotw(this);
            this.o = dotwVar2;
            dotwVar2.execute(new Void[0]);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow();
        setContentView(R.layout.wearable_manage_space_activity);
        this.j = findViewById(R.id.wearable_progress_bar);
        this.k = (TextView) findViewById(R.id.total_size_text);
        this.l = (Button) findViewById(R.id.reclaim_button);
        ListView listView = (ListView) findViewById(R.id.apps_list);
        this.m = listView;
        listView.setOnItemClickListener(this);
        this.l.setOnClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dotv dotvVar = (dotv) this.m.getAdapter();
        if (dotvVar != null && i >= 0 && i < dotvVar.getCount()) {
            String str = dotvVar.getItem(i).a;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            startActivity(intent);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ill.e(getContainerActivity());
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        dotx dotxVar = this.n;
        if (dotxVar != null) {
            dotxVar.cancel(true);
            this.n = null;
        }
        dotw dotwVar = this.o;
        if (dotwVar != null) {
            dotwVar.cancel(true);
            this.o = null;
        }
        super.onPause();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        a();
    }
}
